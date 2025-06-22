package com.bcilab.neurotales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

// Description: SpringBoot启动类
@SpringBootApplication
//@EnableMongoAuditing
public class NeuroTalesMain {
    public static void main(String[] args) {
        SpringApplication.run(NeuroTalesMain.class, args);
    }
}
