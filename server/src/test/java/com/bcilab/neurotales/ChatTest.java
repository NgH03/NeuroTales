package com.bcilab.neurotales;

import com.bcilab.neurotales.utils.ChatAssistant;
import com.bcilab.neurotales.utils.MarkdownParser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Arrays;

@SpringBootTest
public class ChatTest {

    @Autowired
    private ChatAssistant chatAssistant;

    @Autowired
    private MarkdownParser markdownParser;


    @Test
    void testChat() throws IOException {
        double[] eiArrays = {0.895,0.869,0.853,0.759,0.821,0.819,0.784,0.816,0.857,0.875,0.833,0.826,0.831,0.804,0.835,0.873,0.828,0.808,0.732,0.763,0.754,0.743,0.886,0.903,0.836,0.771,0.731,0.733,0.728,0.744,0.674,0.715,0.69,0.822,0.849,0.784,0.821,0.722,0.78,0.772,0.699,0.682,0.65,0.73,0.785,0.793,0.865,0.76,0.798,0.794,0.838,0.839,0.809,0.825,0.747,0.873,0.933,0.938,0.925,0.88,0.808,0.822};
        String eiValues = Arrays.toString(eiArrays);
        System.out.println(chatAssistant.sendMessage(eiValues));
//        String conetnt = chatAssistant.sendMessage("");
//        String html = markdownParser.parse(conetnt);
//        save(html);
    }
}
