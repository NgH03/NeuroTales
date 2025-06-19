package com.bcilab.neurotales.utils;
// Description: TODO

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import org.springframework.stereotype.Component;

@Component
public class MarkdownParser {
    public String parse(String markdown) {
        // 创建解析器和渲染器
        Parser parser = Parser.builder().build();
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        // 解析 Markdown 并渲染为 HTML
        Node document = parser.parse(markdown);

        return renderer.render(document);
    }
}
