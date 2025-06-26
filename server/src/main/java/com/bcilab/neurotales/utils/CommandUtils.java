package com.bcilab.neurotales.utils;
// Description: 执行命令

import dev.langchain4j.agent.tool.P;

import java.io.*;
import java.util.logging.Handler;

public class CommandUtils {

    public static Process exec(String command, OutputHandler handler) throws Exception {
        // 规避注入
//        String[] cmdArray = {"/bin/bash", "-c", command};
//        String[] cmdArray = {command};

        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");

        // 构建命令数组
        String[] cmdArray = isWindows
                ? new String[]{"cmd.exe", "/c", command}
                : new String[]{"/bin/bash", "-c", command};

        ProcessBuilder processBuilder = new ProcessBuilder(cmdArray);
        processBuilder.redirectErrorStream(true);


        Process process = processBuilder.start();

        new Thread(()->handleStream(process.getInputStream(), handler)).start();

        return process;
    }


    private static void handleStream(InputStream inputStream, OutputHandler handler) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            String line;
            while ((line = reader.readLine()) != null) {
                if(handler != null) {
                    handler.handleOutput(line);
                }
            }
        }catch (Exception e) {
            handler.handleError(e);
        }
    }

    public interface OutputHandler{
        void handleOutput(String line);

        default void handleError(Exception e) {
            e.printStackTrace();
        }
    }


    public static String read(Process process) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            return output.toString().trim();
        }
    }

}
