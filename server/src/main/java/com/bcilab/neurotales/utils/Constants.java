package com.bcilab.neurotales.utils;
// Description: TODO

public class Constants {

    public static final String SYSTEM_MESSAGES_EI = "你是一位专业的脑科学专家，特别在专注力的分析和辅助训练方面有很高的成就，现在请根据以下数据生成一份专注力检测报告";
    public static final String HTML = "<!doctype html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta charset='UTF-8'><meta name='viewport' content='width=device-width initial-scale=1'>\n" +
            "\n" +
            "<link href='https://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,700,400&subset=latin,latin-ext' rel='stylesheet' type='text/css' /><style type='text/css'>html {overflow-x: initial !important;}:root { --mermaid-theme: default; --mermaid-sequence-numbers: off; --mermaid-flowchart-curve: linear; --mermaid--gantt-left-padding: 75; --sequence-theme: simple; }\n" +
            "\n" +
            "\n" +
            ":root { --bg-color:#ffffff; --text-color:#333333; --select-text-bg-color:#B5D6FC; --select-text-font-color:auto; --monospace:\"Lucida Console\",Consolas,\"Courier\",monospace; --title-bar-height:20px; }\n" +
            ".mac-os-11 { --title-bar-height:28px; }\n" +
            "html { font-size: 14px; background-color: var(--bg-color); color: var(--text-color); font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif; -webkit-font-smoothing: antialiased; }\n" +
            "h1, h2, h3, h4, h5 { white-space: pre-wrap; }\n" +
            "body { margin: 0px; padding: 0px; height: auto; inset: 0px; font-size: 1rem; line-height: 1.42857; overflow-x: hidden; background: inherit; tab-size: 4; }\n" +
            "iframe { margin: auto; }\n" +
            "a.url { word-break: break-all; }\n" +
            "a:active, a:hover { outline: 0px; }\n" +
            ".in-text-selection, ::selection { text-shadow: none; background: var(--select-text-bg-color); color: var(--select-text-font-color); }\n" +
            "#write { margin: 0px auto; height: auto; width: inherit; word-break: normal; overflow-wrap: break-word; position: relative; white-space: normal; overflow-x: visible; padding-top: 36px; }\n" +
            "#write.first-line-indent p { text-indent: 2em; }\n" +
            "#write.first-line-indent li p, #write.first-line-indent p * { text-indent: 0px; }\n" +
            "#write.first-line-indent li { margin-left: 2em; }\n" +
            ".for-image #write { padding-left: 8px; padding-right: 8px; }\n" +
            "body.typora-export { padding-left: 30px; padding-right: 30px; }\n" +
            ".typora-export .footnote-line, .typora-export li, .typora-export p { white-space: pre-wrap; }\n" +
            ".typora-export .task-list-item input { pointer-events: none; }\n" +
            "@media screen and (max-width: 500px) {\n" +
            "  body.typora-export { padding-left: 0px; padding-right: 0px; }\n" +
            "  #write { padding-left: 20px; padding-right: 20px; }\n" +
            "}\n" +
            "#write li > figure:last-child { margin-bottom: 0.5rem; }\n" +
            "#write ol, #write ul { position: relative; }\n" +
            "img { max-width: 100%; vertical-align: middle; image-orientation: from-image; }\n" +
            "button, input, select, textarea { color: inherit; font: inherit; }\n" +
            "input[type=\"checkbox\"], input[type=\"radio\"] { line-height: normal; padding: 0px; }\n" +
            "*, ::after, ::before { box-sizing: border-box; }\n" +
            "#write h1, #write h2, #write h3, #write h4, #write h5, #write h6, #write p, #write pre { width: inherit; }\n" +
            "#write h1, #write h2, #write h3, #write h4, #write h5, #write h6, #write p { position: relative; }\n" +
            "p { line-height: inherit; }\n" +
            "h1, h2, h3, h4, h5, h6 { break-after: avoid-page; break-inside: avoid; orphans: 4; }\n" +
            "p { orphans: 4; }\n" +
            "h1 { font-size: 2rem; }\n" +
            "h2 { font-size: 1.8rem; }\n" +
            "h3 { font-size: 1.6rem; }\n" +
            "h4 { font-size: 1.4rem; }\n" +
            "h5 { font-size: 1.2rem; }\n" +
            "h6 { font-size: 1rem; }\n" +
            ".md-math-block, .md-rawblock, h1, h2, h3, h4, h5, h6, p { margin-top: 1rem; margin-bottom: 1rem; }\n" +
            ".hidden { display: none; }\n" +
            ".md-blockmeta { color: rgb(204, 204, 204); font-weight: 700; font-style: italic; }\n" +
            "a { cursor: pointer; }\n" +
            "sup.md-footnote { padding: 2px 4px; background-color: rgba(238, 238, 238, 0.7); color: rgb(85, 85, 85); border-radius: 4px; cursor: pointer; }\n" +
            "sup.md-footnote a, sup.md-footnote a:hover { color: inherit; text-transform: inherit; text-decoration: inherit; }\n" +
            "#write input[type=\"checkbox\"] { cursor: pointer; width: inherit; height: inherit; }\n" +
            "figure { overflow-x: auto; margin: 1.2em 0px; max-width: calc(100% + 16px); padding: 0px; }\n" +
            "figure > table { margin: 0px; }\n" +
            "thead, tr { break-inside: avoid; break-after: auto; }\n" +
            "thead { display: table-header-group; }\n" +
            "table { border-collapse: collapse; border-spacing: 0px; width: 100%; overflow: auto; break-inside: auto; text-align: left; }\n" +
            "table.md-table td { min-width: 32px; }\n" +
            ".CodeMirror-gutters { border-right: 0px; background-color: inherit; }\n" +
            ".CodeMirror-linenumber { user-select: none; }\n" +
            ".CodeMirror { text-align: left; }\n" +
            ".CodeMirror-placeholder { opacity: 0.3; }\n" +
            ".CodeMirror pre { padding: 0px 4px; }\n" +
            ".CodeMirror-lines { padding: 0px; }\n" +
            "div.hr:focus { cursor: none; }\n" +
            "#write pre { white-space: pre-wrap; }\n" +
            "#write.fences-no-line-wrapping pre { white-space: pre; }\n" +
            "#write pre.ty-contain-cm { white-space: normal; }\n" +
            ".CodeMirror-gutters { margin-right: 4px; }\n" +
            ".md-fences { font-size: 0.9rem; display: block; break-inside: avoid; text-align: left; overflow: visible; white-space: pre; background: inherit; position: relative !important; }\n" +
            ".md-fences-adv-panel { width: 100%; margin-top: 10px; text-align: center; padding-top: 0px; padding-bottom: 8px; overflow-x: auto; }\n" +
            "#write .md-fences.mock-cm { white-space: pre-wrap; }\n" +
            ".md-fences.md-fences-with-lineno { padding-left: 0px; }\n" +
            "#write.fences-no-line-wrapping .md-fences.mock-cm { white-space: pre; overflow-x: auto; }\n" +
            ".md-fences.mock-cm.md-fences-with-lineno { padding-left: 8px; }\n" +
            ".CodeMirror-line, twitterwidget { break-inside: avoid; }\n" +
            "svg { break-inside: avoid; }\n" +
            ".footnotes { opacity: 0.8; font-size: 0.9rem; margin-top: 1em; margin-bottom: 1em; }\n" +
            ".footnotes + .footnotes { margin-top: 0px; }\n" +
            ".md-reset { margin: 0px; padding: 0px; border: 0px; outline: 0px; vertical-align: top; background: 0px 0px; text-decoration: none; text-shadow: none; float: none; position: static; width: auto; height: auto; white-space: nowrap; cursor: inherit; -webkit-tap-highlight-color: transparent; line-height: normal; font-weight: 400; text-align: left; box-sizing: content-box; direction: ltr; }\n" +
            "li div { padding-top: 0px; }\n" +
            "blockquote { margin: 1rem 0px; }\n" +
            "li .mathjax-block, li p { margin: 0.5rem 0px; }\n" +
            "li blockquote { margin: 1rem 0px; }\n" +
            "li { margin: 0px; position: relative; }\n" +
            "blockquote > :last-child { margin-bottom: 0px; }\n" +
            "blockquote > :first-child, li > :first-child { margin-top: 0px; }\n" +
            ".footnotes-area { color: rgb(136, 136, 136); margin-top: 0.714rem; padding-bottom: 0.143rem; white-space: normal; }\n" +
            "#write .footnote-line { white-space: pre-wrap; }\n" +
            "@media print {\n" +
            "  body, html { border: 1px solid transparent; height: 99%; break-after: avoid; break-before: avoid; font-variant-ligatures: no-common-ligatures; }\n" +
            "  #write { margin-top: 0px; border-color: transparent !important; padding-top: 0px !important; padding-bottom: 0px !important; }\n" +
            "  .typora-export * { -webkit-print-color-adjust: exact; }\n" +
            "  .typora-export #write { break-after: avoid; }\n" +
            "  .typora-export #write::after { height: 0px; }\n" +
            "  .is-mac table { break-inside: avoid; }\n" +
            "  #write > p:nth-child(1) { margin-top: 0px; }\n" +
            "  .typora-export-show-outline .typora-export-sidebar { display: none; }\n" +
            "  figure { overflow-x: visible; }\n" +
            "}\n" +
            ".footnote-line { margin-top: 0.714em; font-size: 0.7em; }\n" +
            "a img, img a { cursor: pointer; }\n" +
            "pre.md-meta-block { font-size: 0.8rem; min-height: 0.8rem; white-space: pre-wrap; background: rgb(204, 204, 204); display: block; overflow-x: hidden; }\n" +
            "p > .md-image:only-child:not(.md-img-error) img, p > img:only-child { display: block; margin: auto; }\n" +
            "#write.first-line-indent p > .md-image:only-child:not(.md-img-error) img { left: -2em; position: relative; }\n" +
            "p > .md-image:only-child { display: inline-block; width: 100%; }\n" +
            "#write .MathJax_Display { margin: 0.8em 0px 0px; }\n" +
            ".md-math-block { width: 100%; }\n" +
            ".md-math-block:not(:empty)::after { display: none; }\n" +
            ".MathJax_ref { fill: currentcolor; }\n" +
            "[contenteditable=\"true\"]:active, [contenteditable=\"true\"]:focus, [contenteditable=\"false\"]:active, [contenteditable=\"false\"]:focus { outline: 0px; box-shadow: none; }\n" +
            ".md-task-list-item { position: relative; list-style-type: none; }\n" +
            ".task-list-item.md-task-list-item { padding-left: 0px; }\n" +
            ".md-task-list-item > input { position: absolute; top: 0px; left: 0px; margin-left: -1.2em; margin-top: calc(1em - 10px); border: none; }\n" +
            ".math { font-size: 1rem; }\n" +
            ".md-toc { min-height: 3.58rem; position: relative; font-size: 0.9rem; border-radius: 10px; }\n" +
            ".md-toc-content { position: relative; margin-left: 0px; }\n" +
            ".md-toc-content::after, .md-toc::after { display: none; }\n" +
            ".md-toc-item { display: block; color: rgb(65, 131, 196); }\n" +
            ".md-toc-item a { text-decoration: none; }\n" +
            ".md-toc-inner:hover { text-decoration: underline; }\n" +
            ".md-toc-inner { display: inline-block; cursor: pointer; }\n" +
            ".md-toc-h1 .md-toc-inner { margin-left: 0px; font-weight: 700; }\n" +
            ".md-toc-h2 .md-toc-inner { margin-left: 2em; }\n" +
            ".md-toc-h3 .md-toc-inner { margin-left: 4em; }\n" +
            ".md-toc-h4 .md-toc-inner { margin-left: 6em; }\n" +
            ".md-toc-h5 .md-toc-inner { margin-left: 8em; }\n" +
            ".md-toc-h6 .md-toc-inner { margin-left: 10em; }\n" +
            "@media screen and (max-width: 48em) {\n" +
            "  .md-toc-h3 .md-toc-inner { margin-left: 3.5em; }\n" +
            "  .md-toc-h4 .md-toc-inner { margin-left: 5em; }\n" +
            "  .md-toc-h5 .md-toc-inner { margin-left: 6.5em; }\n" +
            "  .md-toc-h6 .md-toc-inner { margin-left: 8em; }\n" +
            "}\n" +
            "a.md-toc-inner { font-size: inherit; font-style: inherit; font-weight: inherit; line-height: inherit; }\n" +
            ".footnote-line a:not(.reversefootnote) { color: inherit; }\n" +
            ".reversefootnote { font-family: ui-monospace, sans-serif; }\n" +
            ".md-attr { display: none; }\n" +
            ".md-fn-count::after { content: \".\"; }\n" +
            "code, pre, samp, tt { font-family: var(--monospace); }\n" +
            "kbd { margin: 0px 0.1em; padding: 0.1em 0.6em; font-size: 0.8em; color: rgb(36, 39, 41); background: rgb(255, 255, 255); border: 1px solid rgb(173, 179, 185); border-radius: 3px; box-shadow: rgba(12, 13, 14, 0.2) 0px 1px 0px, rgb(255, 255, 255) 0px 0px 0px 2px inset; white-space: nowrap; vertical-align: middle; }\n" +
            ".md-comment { color: rgb(162, 127, 3); opacity: 0.6; font-family: var(--monospace); }\n" +
            "code { text-align: left; vertical-align: initial; }\n" +
            "a.md-print-anchor { white-space: pre !important; border-width: initial !important; border-style: none !important; border-color: initial !important; display: inline-block !important; position: absolute !important; width: 1px !important; right: 0px !important; outline: 0px !important; background: 0px 0px !important; text-decoration: initial !important; text-shadow: initial !important; }\n" +
            ".os-windows.monocolor-emoji .md-emoji { font-family: \"Segoe UI Symbol\", sans-serif; }\n" +
            ".md-diagram-panel > svg { max-width: 100%; }\n" +
            "[lang=\"flow\"] svg, [lang=\"mermaid\"] svg { max-width: 100%; height: auto; }\n" +
            "[lang=\"mermaid\"] .node text { font-size: 1rem; }\n" +
            "table tr th { border-bottom: 0px; }\n" +
            "video { max-width: 100%; display: block; margin: 0px auto; }\n" +
            "iframe { max-width: 100%; width: 100%; border: none; }\n" +
            ".highlight td, .highlight tr { border: 0px; }\n" +
            "mark { background: rgb(255, 255, 0); color: rgb(0, 0, 0); }\n" +
            ".md-html-inline .md-plain, .md-html-inline strong, mark .md-inline-math, mark strong { color: inherit; }\n" +
            ".md-expand mark .md-meta { opacity: 0.3 !important; }\n" +
            "mark .md-meta { color: rgb(0, 0, 0); }\n" +
            "@media print {\n" +
            "  .typora-export h1, .typora-export h2, .typora-export h3, .typora-export h4, .typora-export h5, .typora-export h6 { break-inside: avoid; }\n" +
            "}\n" +
            ".md-diagram-panel .messageText { stroke: none !important; }\n" +
            ".md-diagram-panel .start-state { fill: var(--node-fill); }\n" +
            ".md-diagram-panel .edgeLabel rect { opacity: 1 !important; }\n" +
            ".md-fences.md-fences-math { font-size: 1em; }\n" +
            ".md-fences-advanced:not(.md-focus) { padding: 0px; white-space: nowrap; border: 0px; }\n" +
            ".md-fences-advanced:not(.md-focus) { background: inherit; }\n" +
            ".typora-export-show-outline .typora-export-content { max-width: 1440px; margin: auto; display: flex; flex-direction: row; }\n" +
            ".typora-export-sidebar { width: 300px; font-size: 0.8rem; margin-top: 80px; margin-right: 18px; }\n" +
            ".typora-export-show-outline #write { --webkit-flex:2; flex: 2 1 0%; }\n" +
            ".typora-export-sidebar .outline-content { position: fixed; top: 0px; max-height: 100%; overflow: hidden auto; padding-bottom: 30px; padding-top: 60px; width: 300px; }\n" +
            "@media screen and (max-width: 1024px) {\n" +
            "  .typora-export-sidebar, .typora-export-sidebar .outline-content { width: 240px; }\n" +
            "}\n" +
            "@media screen and (max-width: 800px) {\n" +
            "  .typora-export-sidebar { display: none; }\n" +
            "}\n" +
            ".outline-content li, .outline-content ul { margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; list-style: none; overflow-wrap: anywhere; }\n" +
            ".outline-content ul { margin-top: 0px; margin-bottom: 0px; }\n" +
            ".outline-content strong { font-weight: 400; }\n" +
            ".outline-expander { width: 1rem; height: 1.42857rem; position: relative; display: table-cell; vertical-align: middle; cursor: pointer; padding-left: 4px; }\n" +
            ".outline-expander::before { content: \"\uF125\"; position: relative; font-family: Ionicons; display: inline-block; font-size: 8px; vertical-align: middle; }\n" +
            ".outline-item { padding-top: 3px; padding-bottom: 3px; cursor: pointer; }\n" +
            ".outline-expander:hover::before { content: \"\uF123\"; }\n" +
            ".outline-h1 > .outline-item { padding-left: 0px; }\n" +
            ".outline-h2 > .outline-item { padding-left: 1em; }\n" +
            ".outline-h3 > .outline-item { padding-left: 2em; }\n" +
            ".outline-h4 > .outline-item { padding-left: 3em; }\n" +
            ".outline-h5 > .outline-item { padding-left: 4em; }\n" +
            ".outline-h6 > .outline-item { padding-left: 5em; }\n" +
            ".outline-label { cursor: pointer; display: table-cell; vertical-align: middle; text-decoration: none; color: inherit; }\n" +
            ".outline-label:hover { text-decoration: underline; }\n" +
            ".outline-item:hover { border-color: rgb(245, 245, 245); background-color: var(--item-hover-bg-color); }\n" +
            ".outline-item:hover { margin-left: -28px; margin-right: -28px; border-left: 28px solid transparent; border-right: 28px solid transparent; }\n" +
            ".outline-item-single .outline-expander::before, .outline-item-single .outline-expander:hover::before { display: none; }\n" +
            ".outline-item-open > .outline-item > .outline-expander::before { content: \"\uF123\"; }\n" +
            ".outline-children { display: none; }\n" +
            ".info-panel-tab-wrapper { display: none; }\n" +
            ".outline-item-open > .outline-children { display: block; }\n" +
            ".typora-export .outline-item { padding-top: 1px; padding-bottom: 1px; }\n" +
            ".typora-export .outline-item:hover { margin-right: -8px; border-right: 8px solid transparent; }\n" +
            ".typora-export .outline-expander::before { content: \"+\"; font-family: inherit; top: -1px; }\n" +
            ".typora-export .outline-expander:hover::before, .typora-export .outline-item-open > .outline-item > .outline-expander::before { content: \"−\"; }\n" +
            ".typora-export-collapse-outline .outline-children { display: none; }\n" +
            ".typora-export-collapse-outline .outline-item-open > .outline-children, .typora-export-no-collapse-outline .outline-children { display: block; }\n" +
            ".typora-export-no-collapse-outline .outline-expander::before { content: \"\" !important; }\n" +
            ".typora-export-show-outline .outline-item-active > .outline-item .outline-label { font-weight: 700; }\n" +
            ".md-inline-math-container mjx-container { zoom: 0.95; }\n" +
            "mjx-container { break-inside: avoid; }\n" +
            "\n" +
            "\n" +
            ".CodeMirror { height: auto; }\n" +
            ".CodeMirror.cm-s-inner { background: inherit; }\n" +
            ".CodeMirror-scroll { overflow: auto hidden; z-index: 3; }\n" +
            ".CodeMirror-gutter-filler, .CodeMirror-scrollbar-filler { background-color: rgb(255, 255, 255); }\n" +
            ".CodeMirror-gutters { border-right: 1px solid rgb(221, 221, 221); background: inherit; white-space: nowrap; }\n" +
            ".CodeMirror-linenumber { padding: 0px 3px 0px 5px; text-align: right; color: rgb(153, 153, 153); }\n" +
            ".cm-s-inner .cm-keyword { color: rgb(119, 0, 136); }\n" +
            ".cm-s-inner .cm-atom, .cm-s-inner.cm-atom { color: rgb(34, 17, 153); }\n" +
            ".cm-s-inner .cm-number { color: rgb(17, 102, 68); }\n" +
            ".cm-s-inner .cm-def { color: rgb(0, 0, 255); }\n" +
            ".cm-s-inner .cm-variable { color: rgb(0, 0, 0); }\n" +
            ".cm-s-inner .cm-variable-2 { color: rgb(0, 85, 170); }\n" +
            ".cm-s-inner .cm-variable-3 { color: rgb(0, 136, 85); }\n" +
            ".cm-s-inner .cm-string { color: rgb(170, 17, 17); }\n" +
            ".cm-s-inner .cm-property { color: rgb(0, 0, 0); }\n" +
            ".cm-s-inner .cm-operator { color: rgb(152, 26, 26); }\n" +
            ".cm-s-inner .cm-comment, .cm-s-inner.cm-comment { color: rgb(170, 85, 0); }\n" +
            ".cm-s-inner .cm-string-2 { color: rgb(255, 85, 0); }\n" +
            ".cm-s-inner .cm-meta { color: rgb(85, 85, 85); }\n" +
            ".cm-s-inner .cm-qualifier { color: rgb(85, 85, 85); }\n" +
            ".cm-s-inner .cm-builtin { color: rgb(51, 0, 170); }\n" +
            ".cm-s-inner .cm-bracket { color: rgb(153, 153, 119); }\n" +
            ".cm-s-inner .cm-tag { color: rgb(17, 119, 0); }\n" +
            ".cm-s-inner .cm-attribute { color: rgb(0, 0, 204); }\n" +
            ".cm-s-inner .cm-header, .cm-s-inner.cm-header { color: rgb(0, 0, 255); }\n" +
            ".cm-s-inner .cm-quote, .cm-s-inner.cm-quote { color: rgb(0, 153, 0); }\n" +
            ".cm-s-inner .cm-hr, .cm-s-inner.cm-hr { color: rgb(153, 153, 153); }\n" +
            ".cm-s-inner .cm-link, .cm-s-inner.cm-link { color: rgb(0, 0, 204); }\n" +
            ".cm-negative { color: rgb(221, 68, 68); }\n" +
            ".cm-positive { color: rgb(34, 153, 34); }\n" +
            ".cm-header, .cm-strong { font-weight: 700; }\n" +
            ".cm-del { text-decoration: line-through; }\n" +
            ".cm-em { font-style: italic; }\n" +
            ".cm-link { text-decoration: underline; }\n" +
            ".cm-error { color: red; }\n" +
            ".cm-invalidchar { color: red; }\n" +
            ".cm-constant { color: rgb(38, 139, 210); }\n" +
            ".cm-defined { color: rgb(181, 137, 0); }\n" +
            "div.CodeMirror span.CodeMirror-matchingbracket { color: rgb(0, 255, 0); }\n" +
            "div.CodeMirror span.CodeMirror-nonmatchingbracket { color: rgb(255, 34, 34); }\n" +
            ".cm-s-inner .CodeMirror-activeline-background { background: inherit; }\n" +
            ".CodeMirror { position: relative; overflow: hidden; }\n" +
            ".CodeMirror-scroll { height: 100%; outline: 0px; position: relative; box-sizing: content-box; background: inherit; }\n" +
            ".CodeMirror-sizer { position: relative; }\n" +
            ".CodeMirror-gutter-filler, .CodeMirror-hscrollbar, .CodeMirror-scrollbar-filler, .CodeMirror-vscrollbar { position: absolute; z-index: 6; display: none; outline: 0px; }\n" +
            ".CodeMirror-vscrollbar { right: 0px; top: 0px; overflow: hidden; }\n" +
            ".CodeMirror-hscrollbar { bottom: 0px; left: 0px; overflow: auto hidden; }\n" +
            ".CodeMirror-scrollbar-filler { right: 0px; bottom: 0px; }\n" +
            ".CodeMirror-gutter-filler { left: 0px; bottom: 0px; }\n" +
            ".CodeMirror-gutters { position: absolute; left: 0px; top: 0px; padding-bottom: 10px; z-index: 3; overflow-y: hidden; }\n" +
            ".CodeMirror-gutter { white-space: normal; height: 100%; box-sizing: content-box; padding-bottom: 30px; margin-bottom: -32px; display: inline-block; }\n" +
            ".CodeMirror-gutter-wrapper { position: absolute; z-index: 4; background: 0px 0px !important; border: none !important; }\n" +
            ".CodeMirror-gutter-background { position: absolute; top: 0px; bottom: 0px; z-index: 4; }\n" +
            ".CodeMirror-gutter-elt { position: absolute; cursor: default; z-index: 4; }\n" +
            ".CodeMirror-lines { cursor: text; }\n" +
            ".CodeMirror pre { border-radius: 0px; border-width: 0px; background: 0px 0px; font-family: inherit; font-size: inherit; margin: 0px; white-space: pre; overflow-wrap: normal; color: inherit; z-index: 2; position: relative; overflow: visible; }\n" +
            ".CodeMirror-wrap pre { overflow-wrap: break-word; white-space: pre-wrap; word-break: normal; }\n" +
            ".CodeMirror-code pre { border-right: 30px solid transparent; width: fit-content; }\n" +
            ".CodeMirror-wrap .CodeMirror-code pre { border-right: none; width: auto; }\n" +
            ".CodeMirror-linebackground { position: absolute; inset: 0px; z-index: 0; }\n" +
            ".CodeMirror-linewidget { position: relative; z-index: 2; overflow: auto; }\n" +
            ".CodeMirror-wrap .CodeMirror-scroll { overflow-x: hidden; }\n" +
            ".CodeMirror-measure { position: absolute; width: 100%; height: 0px; overflow: hidden; visibility: hidden; }\n" +
            ".CodeMirror-measure pre { position: static; }\n" +
            ".CodeMirror div.CodeMirror-cursor { position: absolute; visibility: hidden; border-right: none; width: 0px; }\n" +
            ".CodeMirror div.CodeMirror-cursor { visibility: hidden; }\n" +
            ".CodeMirror-focused div.CodeMirror-cursor { visibility: inherit; }\n" +
            ".cm-searching { background: rgba(255, 255, 0, 0.4); }\n" +
            "span.cm-underlined { text-decoration: underline; }\n" +
            "span.cm-strikethrough { text-decoration: line-through; }\n" +
            ".cm-tw-syntaxerror { color: rgb(255, 255, 255); background-color: rgb(153, 0, 0); }\n" +
            ".cm-tw-deleted { text-decoration: line-through; }\n" +
            ".cm-tw-header5 { font-weight: 700; }\n" +
            ".cm-tw-listitem:first-child { padding-left: 10px; }\n" +
            ".cm-tw-box { border-style: solid; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; border-color: inherit; border-top-width: 0px !important; }\n" +
            ".cm-tw-underline { text-decoration: underline; }\n" +
            "@media print {\n" +
            "  .CodeMirror div.CodeMirror-cursor { visibility: hidden; }\n" +
            "}\n" +
            "\n" +
            "\n" +
            ":root {\n" +
            "    --side-bar-bg-color: #fafafa;\n" +
            "    --control-text-color: #777;\n" +
            "}\n" +
            "\n" +
            "@include-when-export url(https://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,700,400&subset=latin,latin-ext);\n" +
            "\n" +
            "/* open-sans-regular - latin-ext_latin */\n" +
            "  /* open-sans-italic - latin-ext_latin */\n" +
            "    /* open-sans-700 - latin-ext_latin */\n" +
            "    /* open-sans-700italic - latin-ext_latin */\n" +
            "  html {\n" +
            "    font-size: 16px;\n" +
            "    -webkit-font-smoothing: antialiased;\n" +
            "}\n" +
            "\n" +
            "body {\n" +
            "    font-family: \"Open Sans\",\"Clear Sans\", \"Helvetica Neue\", Helvetica, Arial, 'Segoe UI Emoji', sans-serif;\n" +
            "    color: rgb(51, 51, 51);\n" +
            "    line-height: 1.6;\n" +
            "}\n" +
            "\n" +
            "#write {\n" +
            "    max-width: 860px;\n" +
            "  \tmargin: 0 auto;\n" +
            "  \tpadding: 30px;\n" +
            "    padding-bottom: 100px;\n" +
            "}\n" +
            "\n" +
            "@media only screen and (min-width: 1400px) {\n" +
            "\t#write {\n" +
            "\t\tmax-width: 1024px;\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "@media only screen and (min-width: 1800px) {\n" +
            "\t#write {\n" +
            "\t\tmax-width: 1200px;\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "#write > ul:first-child,\n" +
            "#write > ol:first-child{\n" +
            "    margin-top: 30px;\n" +
            "}\n" +
            "\n" +
            "a {\n" +
            "    color: #4183C4;\n" +
            "}\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "    position: relative;\n" +
            "    margin-top: 1rem;\n" +
            "    margin-bottom: 1rem;\n" +
            "    font-weight: bold;\n" +
            "    line-height: 1.4;\n" +
            "    cursor: text;\n" +
            "}\n" +
            "h1:hover a.anchor,\n" +
            "h2:hover a.anchor,\n" +
            "h3:hover a.anchor,\n" +
            "h4:hover a.anchor,\n" +
            "h5:hover a.anchor,\n" +
            "h6:hover a.anchor {\n" +
            "    text-decoration: none;\n" +
            "}\n" +
            "h1 tt,\n" +
            "h1 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h2 tt,\n" +
            "h2 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h3 tt,\n" +
            "h3 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h4 tt,\n" +
            "h4 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h5 tt,\n" +
            "h5 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h6 tt,\n" +
            "h6 code {\n" +
            "    font-size: inherit;\n" +
            "}\n" +
            "h1 {\n" +
            "    font-size: 2.25em;\n" +
            "    line-height: 1.2;\n" +
            "    border-bottom: 1px solid #eee;\n" +
            "}\n" +
            "h2 {\n" +
            "    font-size: 1.75em;\n" +
            "    line-height: 1.225;\n" +
            "    border-bottom: 1px solid #eee;\n" +
            "}\n" +
            "\n" +
            "/*@media print {\n" +
            "    .typora-export h1,\n" +
            "    .typora-export h2 {\n" +
            "        border-bottom: none;\n" +
            "        padding-bottom: initial;\n" +
            "    }\n" +
            "\n" +
            "    .typora-export h1::after,\n" +
            "    .typora-export h2::after {\n" +
            "        content: \"\";\n" +
            "        display: block;\n" +
            "        height: 100px;\n" +
            "        margin-top: -96px;\n" +
            "        border-top: 1px solid #eee;\n" +
            "    }\n" +
            "}*/\n" +
            "\n" +
            "h3 {\n" +
            "    font-size: 1.5em;\n" +
            "    line-height: 1.43;\n" +
            "}\n" +
            "h4 {\n" +
            "    font-size: 1.25em;\n" +
            "}\n" +
            "h5 {\n" +
            "    font-size: 1em;\n" +
            "}\n" +
            "h6 {\n" +
            "   font-size: 1em;\n" +
            "    color: #777;\n" +
            "}\n" +
            "p,\n" +
            "blockquote,\n" +
            "ul,\n" +
            "ol,\n" +
            "dl,\n" +
            "table{\n" +
            "    margin: 0.8em 0;\n" +
            "}\n" +
            "li>ol,\n" +
            "li>ul {\n" +
            "    margin: 0 0;\n" +
            "}\n" +
            "hr {\n" +
            "    height: 2px;\n" +
            "    padding: 0;\n" +
            "    margin: 16px 0;\n" +
            "    background-color: #e7e7e7;\n" +
            "    border: 0 none;\n" +
            "    overflow: hidden;\n" +
            "    box-sizing: content-box;\n" +
            "}\n" +
            "\n" +
            "li p.first {\n" +
            "    display: inline-block;\n" +
            "}\n" +
            "ul,\n" +
            "ol {\n" +
            "    padding-left: 30px;\n" +
            "}\n" +
            "ul:first-child,\n" +
            "ol:first-child {\n" +
            "    margin-top: 0;\n" +
            "}\n" +
            "ul:last-child,\n" +
            "ol:last-child {\n" +
            "    margin-bottom: 0;\n" +
            "}\n" +
            "blockquote {\n" +
            "    border-left: 4px solid #dfe2e5;\n" +
            "    padding: 0 15px;\n" +
            "    color: #777777;\n" +
            "}\n" +
            "blockquote blockquote {\n" +
            "    padding-right: 0;\n" +
            "}\n" +
            "table {\n" +
            "    padding: 0;\n" +
            "    word-break: initial;\n" +
            "}\n" +
            "table tr {\n" +
            "    border: 1px solid #dfe2e5;\n" +
            "    margin: 0;\n" +
            "    padding: 0;\n" +
            "}\n" +
            "table tr:nth-child(2n),\n" +
            "thead {\n" +
            "    background-color: #f8f8f8;\n" +
            "}\n" +
            "table th {\n" +
            "    font-weight: bold;\n" +
            "    border: 1px solid #dfe2e5;\n" +
            "    border-bottom: 0;\n" +
            "    margin: 0;\n" +
            "    padding: 6px 13px;\n" +
            "}\n" +
            "table td {\n" +
            "    border: 1px solid #dfe2e5;\n" +
            "    margin: 0;\n" +
            "    padding: 6px 13px;\n" +
            "}\n" +
            "table th:first-child,\n" +
            "table td:first-child {\n" +
            "    margin-top: 0;\n" +
            "}\n" +
            "table th:last-child,\n" +
            "table td:last-child {\n" +
            "    margin-bottom: 0;\n" +
            "}\n" +
            "\n" +
            ".CodeMirror-lines {\n" +
            "    padding-left: 4px;\n" +
            "}\n" +
            "\n" +
            ".code-tooltip {\n" +
            "    box-shadow: 0 1px 1px 0 rgba(0,28,36,.3);\n" +
            "    border-top: 1px solid #eef2f2;\n" +
            "}\n" +
            "\n" +
            ".md-fences,\n" +
            "code,\n" +
            "tt {\n" +
            "    border: 1px solid #e7eaed;\n" +
            "    background-color: #f8f8f8;\n" +
            "    border-radius: 3px;\n" +
            "    padding: 0;\n" +
            "    padding: 2px 4px 0px 4px;\n" +
            "    font-size: 0.9em;\n" +
            "}\n" +
            "\n" +
            "code {\n" +
            "    background-color: #f3f4f4;\n" +
            "    padding: 0 2px 0 2px;\n" +
            "}\n" +
            "\n" +
            ".md-fences {\n" +
            "    margin-bottom: 15px;\n" +
            "    margin-top: 15px;\n" +
            "    padding-top: 8px;\n" +
            "    padding-bottom: 6px;\n" +
            "}\n" +
            "\n" +
            "\n" +
            ".md-task-list-item > input {\n" +
            "  margin-left: -1.3em;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "    html {\n" +
            "        font-size: 13px;\n" +
            "    }\n" +
            "    pre {\n" +
            "        page-break-inside: avoid;\n" +
            "        word-wrap: break-word;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            ".md-fences {\n" +
            "\tbackground-color: #f8f8f8;\n" +
            "}\n" +
            "#write pre.md-meta-block {\n" +
            "\tpadding: 1rem;\n" +
            "    font-size: 85%;\n" +
            "    line-height: 1.45;\n" +
            "    background-color: #f7f7f7;\n" +
            "    border: 0;\n" +
            "    border-radius: 3px;\n" +
            "    color: #777777;\n" +
            "    margin-top: 0 !important;\n" +
            "}\n" +
            "\n" +
            ".mathjax-block>.code-tooltip {\n" +
            "\tbottom: .375rem;\n" +
            "}\n" +
            "\n" +
            ".md-mathjax-midline {\n" +
            "    background: #fafafa;\n" +
            "}\n" +
            "\n" +
            "#write>h3.md-focus:before{\n" +
            "\tleft: -1.5625rem;\n" +
            "\ttop: .375rem;\n" +
            "}\n" +
            "#write>h4.md-focus:before{\n" +
            "\tleft: -1.5625rem;\n" +
            "\ttop: .285714286rem;\n" +
            "}\n" +
            "#write>h5.md-focus:before{\n" +
            "\tleft: -1.5625rem;\n" +
            "\ttop: .285714286rem;\n" +
            "}\n" +
            "#write>h6.md-focus:before{\n" +
            "\tleft: -1.5625rem;\n" +
            "\ttop: .285714286rem;\n" +
            "}\n" +
            ".md-image>.md-meta {\n" +
            "    /*border: 1px solid #ddd;*/\n" +
            "    border-radius: 3px;\n" +
            "    padding: 2px 0px 0px 4px;\n" +
            "    font-size: 0.9em;\n" +
            "    color: inherit;\n" +
            "}\n" +
            "\n" +
            ".md-tag {\n" +
            "    color: #a7a7a7;\n" +
            "    opacity: 1;\n" +
            "}\n" +
            "\n" +
            ".md-toc { \n" +
            "    margin-top:20px;\n" +
            "    padding-bottom:20px;\n" +
            "}\n" +
            "\n" +
            ".sidebar-tabs {\n" +
            "    border-bottom: none;\n" +
            "}\n" +
            "\n" +
            "#typora-quick-open {\n" +
            "    border: 1px solid #ddd;\n" +
            "    background-color: #f8f8f8;\n" +
            "}\n" +
            "\n" +
            "#typora-quick-open-item {\n" +
            "    background-color: #FAFAFA;\n" +
            "    border-color: #FEFEFE #e5e5e5 #e5e5e5 #eee;\n" +
            "    border-style: solid;\n" +
            "    border-width: 1px;\n" +
            "}\n" +
            "\n" +
            "/** focus mode */\n" +
            ".on-focus-mode blockquote {\n" +
            "    border-left-color: rgba(85, 85, 85, 0.12);\n" +
            "}\n" +
            "\n" +
            "header, .context-menu, .megamenu-content, footer{\n" +
            "    font-family: \"Segoe UI\", \"Arial\", sans-serif;\n" +
            "}\n" +
            "\n" +
            ".file-node-content:hover .file-node-icon,\n" +
            ".file-node-content:hover .file-node-open-state{\n" +
            "    visibility: visible;\n" +
            "}\n" +
            "\n" +
            ".mac-seamless-mode #typora-sidebar {\n" +
            "    background-color: #fafafa;\n" +
            "    background-color: var(--side-bar-bg-color);\n" +
            "}\n" +
            "\n" +
            ".md-lang {\n" +
            "    color: #b4654d;\n" +
            "}\n" +
            "\n" +
            "/*.html-for-mac {\n" +
            "    --item-hover-bg-color: #E6F0FE;\n" +
            "}*/\n" +
            "\n" +
            "#md-notification .btn {\n" +
            "    border: 0;\n" +
            "}\n" +
            "\n" +
            ".dropdown-menu .divider {\n" +
            "    border-color: #e5e5e5;\n" +
            "    opacity: 0.4;\n" +
            "}\n" +
            "\n" +
            ".ty-preferences .window-content {\n" +
            "    background-color: #fafafa;\n" +
            "}\n" +
            "\n" +
            ".ty-preferences .nav-group-item.active {\n" +
            "    color: white;\n" +
            "    background: #999;\n" +
            "}\n" +
            "\n" +
            ".menu-item-container a.menu-style-btn {\n" +
            "    background-color: #f5f8fa;\n" +
            "    background-image: linear-gradient( 180deg , hsla(0, 0%, 100%, 0.8), hsla(0, 0%, 100%, 0)); \n" +
            "}\n" +
            "\n" +
            "\n" +
            "\n" +
            "</style><title>report</title>\n" +
            "</head>\n" +
            "<body class='typora-export os-windows'><div class='typora-export-content'>\n" +
            "<div id='write'  class=''><h3 id='专注力检测报告'><span>专注力检测报告</span></h3><h4 id='用户信息'><span>用户信息</span></h4><ul><li><p><strong><span>年龄</span></strong><span>：21</span></p></li><li><p><strong><span>性别</span></strong><span>：男</span></p></li><li><p><strong><span>行为</span></strong><span>：短时间冥想</span></p></li></ul><h4 id='专注力数据分析'><span>专注力数据分析</span></h4><h4 id='分析依据'><span>分析依据</span></h4><ul><li><p><strong><span>β/(α+θ)</span></strong><span>：代表了大脑的认知参与度。比值上升表示认知参与度提高，即大脑在进行深度思考和活跃加工的同时，抑制无关的感觉输入。</span></p></li><li><p><strong><span>专注力状态分类</span></strong><span>：</span></p><ul><li><p><strong><span>走神</span></strong><span>：β/(α+θ) &lt; 0.2</span></p></li><li><p><strong><span>一般</span></strong><span>：0.2 ≤ β/(α+θ) &lt; 0.5</span></p></li><li><p><strong><span>专注</span></strong><span>：β/(α+θ) ≥ 0.5</span></p></li></ul></li></ul><h4 id='专注力状态分类及各状态持续时间'><span>专注力状态分类及各状态持续时间</span></h4><ul><li><p><span>走神持续时间：30秒</span></p></li><li><p><span>一般持续时间：40秒</span></p></li><li><p><span>专注持续时间：8秒</span></p></li></ul><h4 id='专注力变化趋势'><span>专注力变化趋势</span></h4><ul><li><p><strong><span>总体趋势</span></strong><span>：从开始的较低专注力逐渐上升到较高水平，然后在中间阶段达到峰值，随后逐渐下降并趋于稳定。</span></p></li><li><p><strong><span>具体变化</span></strong><span>：</span></p><ul><li><p><strong><span>初始阶段</span></strong><span>（前10秒）：专注力较低，处于走神状态。</span></p></li><li><p><strong><span>上升阶段</span></strong><span>（10-30秒）：专注力逐渐上升，进入一般状态。</span></p></li><li><p><strong><span>高峰阶段</span></strong><span>（30-40秒）：专注力达到最高，进入专注状态。</span></p></li><li><p><strong><span>下降阶段</span></strong><span>（40-50秒）：专注力逐渐下降，回到一般状态。</span></p></li><li><p><strong><span>稳定阶段</span></strong><span>（50-60秒）：专注力趋于稳定，保持在一般状态。</span></p></li></ul></li></ul><h4 id='结果总览'><span>结果总览</span></h4><ul><li><p><strong><span>专注力得分</span></strong><span>：根据专注力数值的变化，您的专注力得分在实验过程中表现出明显的波动。总体上，您在实验初期和末期的专注力较低，但在中间阶段达到了较高的专注水平。</span></p></li><li><p><strong><span>放松能力得分</span></strong><span>：您的放松能力在实验初期和末期表现较好，但中间阶段由于专注力的提高，放松能力有所下降。</span></p></li></ul><h4 id='推荐解决方案'><span>推荐解决方案</span></h4><ul><li><p><strong><span>个性化训练建议</span></strong><span>：</span></p><ul><li><p><strong><span>冥想练习</span></strong><span>：继续进行短时间冥想练习，以提高您的专注力和放松能力。建议每天进行10-15分钟的冥想，逐步增加时间。</span></p></li><li><p><strong><span>注意力训练</span></strong><span>：通过一些专门的注意力训练游戏或应用程序，如“专注森林”、“番茄工作法”等，来提高您的专注力。</span></p></li><li><p><strong><span>环境调整</span></strong><span>：在进行需要高度专注的任务时，尽量选择一个安静、无干扰的环境，减少外界干扰。</span></p></li><li><p><strong><span>定期休息</span></strong><span>：在长时间的工作或学习中，每隔一段时间进行短暂的休息，以恢复精力和注意力。</span></p></li></ul></li></ul><h4 id='数据可视化'><span>数据可视化</span></h4><div class=\"md-diagram-panel md-fences-adv-panel\"><svg id=\"mermaidChart0\" width=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" style=\"max-width: 142.9729766845703px;\" viewBox=\"-8 -8 142.9729766845703 509.60809326171875\" role=\"graphics-document document\" aria-roledescription=\"flowchart-v2\" class=\"\"><style>#mermaidChart0{font-family:sans-serif;font-size:16px;fill:#333;}#mermaidChart0 .error-icon{fill:#552222;}#mermaidChart0 .error-text{fill:#552222;stroke:#552222;}#mermaidChart0 .edge-thickness-normal{stroke-width:2px;}#mermaidChart0 .edge-thickness-thick{stroke-width:3.5px;}#mermaidChart0 .edge-pattern-solid{stroke-dasharray:0;}#mermaidChart0 .edge-pattern-dashed{stroke-dasharray:3;}#mermaidChart0 .edge-pattern-dotted{stroke-dasharray:2;}#mermaidChart0 .marker{fill:#333333;stroke:#333333;}#mermaidChart0 .marker.cross{stroke:#333333;}#mermaidChart0 svg{font-family:sans-serif;font-size:16px;}#mermaidChart0 .label{font-family:sans-serif;color:#333;}#mermaidChart0 .cluster-label text{fill:#333;}#mermaidChart0 .cluster-label span,#mermaidChart0 p{color:#333;}#mermaidChart0 .label text,#mermaidChart0 span,#mermaidChart0 p{fill:#333;color:#333;}#mermaidChart0 .node rect,#mermaidChart0 .node circle,#mermaidChart0 .node ellipse,#mermaidChart0 .node polygon,#mermaidChart0 .node path{fill:#ECECFF;stroke:#9370DB;stroke-width:1px;}#mermaidChart0 .flowchart-label text{text-anchor:middle;}#mermaidChart0 .node .label{text-align:center;}#mermaidChart0 .node.clickable{cursor:pointer;}#mermaidChart0 .arrowheadPath{fill:#333333;}#mermaidChart0 .edgePath .path{stroke:#333333;stroke-width:2.0px;}#mermaidChart0 .flowchart-link{stroke:#333333;fill:none;}#mermaidChart0 .edgeLabel{background-color:#e8e8e8;text-align:center;}#mermaidChart0 .edgeLabel rect{opacity:0.5;background-color:#e8e8e8;fill:#e8e8e8;}#mermaidChart0 .cluster rect{fill:#ffffde;stroke:#aaaa33;stroke-width:1px;}#mermaidChart0 .cluster text{fill:#333;}#mermaidChart0 .cluster span,#mermaidChart0 p{color:#333;}#mermaidChart0 div.mermaidTooltip{position:absolute;text-align:center;max-width:200px;padding:2px;font-family:sans-serif;font-size:12px;background:hsl(80, 100%, 96.2745098039%);border:1px solid #aaaa33;border-radius:2px;pointer-events:none;z-index:100;}#mermaidChart0 .flowchartTitleText{text-anchor:middle;font-size:18px;fill:#333;}#mermaidChart0 :root{--mermaid-alt-font-family:sans-serif;}</style><g><marker id=\"flowchart-pointEnd\" class=\"marker flowchart\" viewBox=\"0 0 12 20\" refX=\"10\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"12\" markerHeight=\"12\" orient=\"auto\"><path d=\"M 0 0 L 10 5 L 0 10 z\" class=\"arrowMarkerPath\" style=\"stroke-width: 1; stroke-dasharray: 1, 0;\"></path></marker><marker id=\"flowchart-pointStart\" class=\"marker flowchart\" viewBox=\"0 0 10 10\" refX=\"0\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"12\" markerHeight=\"12\" orient=\"auto\"><path d=\"M 0 5 L 10 10 L 10 0 z\" class=\"arrowMarkerPath\" style=\"stroke-width: 1; stroke-dasharray: 1, 0;\"></path></marker><marker id=\"flowchart-circleEnd\" class=\"marker flowchart\" viewBox=\"0 0 10 10\" refX=\"11\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto\"><circle cx=\"5\" cy=\"5\" r=\"5\" class=\"arrowMarkerPath\" style=\"stroke-width: 1; stroke-dasharray: 1, 0;\"></circle></marker><marker id=\"flowchart-circleStart\" class=\"marker flowchart\" viewBox=\"0 0 10 10\" refX=\"-1\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto\"><circle cx=\"5\" cy=\"5\" r=\"5\" class=\"arrowMarkerPath\" style=\"stroke-width: 1; stroke-dasharray: 1, 0;\"></circle></marker><marker id=\"flowchart-crossEnd\" class=\"marker cross flowchart\" viewBox=\"0 0 11 11\" refX=\"12\" refY=\"5.2\" markerUnits=\"userSpaceOnUse\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto\"><path d=\"M 1,1 l 9,9 M 10,1 l -9,9\" class=\"arrowMarkerPath\" style=\"stroke-width: 2; stroke-dasharray: 1, 0;\"></path></marker><marker id=\"flowchart-crossStart\" class=\"marker cross flowchart\" viewBox=\"0 0 11 11\" refX=\"-1\" refY=\"5.2\" markerUnits=\"userSpaceOnUse\" markerWidth=\"11\" markerHeight=\"11\" orient=\"auto\"><path d=\"M 1,1 l 9,9 M 10,1 l -9,9\" class=\"arrowMarkerPath\" style=\"stroke-width: 2; stroke-dasharray: 1, 0;\"></path></marker><g class=\"root\"><g class=\"clusters\"></g><g class=\"edgePaths\"><path d=\"M63.486488342285156,40.60135269165039L63.486488342285156,65.60135269165039L63.486488342285156,90.60135269165039\" id=\"L-A-B-0\" class=\" edge-thickness-normal edge-pattern-solid flowchart-link LS-A LE-B\" style=\"fill:none;\" marker-end=\"url(#flowchart-pointEnd)\"></path><path d=\"M63.486488342285156,131.20270538330078L63.486488342285156,156.20270538330078L63.486488342285156,181.20270538330078\" id=\"L-B-C-0\" class=\" edge-thickness-normal edge-pattern-solid flowchart-link LS-B LE-C\" style=\"fill:none;\" marker-end=\"url(#flowchart-pointEnd)\"></path><path d=\"M63.486488342285156,221.80405807495117L63.486488342285156,246.80405807495117L63.486488342285156,271.8040580749512\" id=\"L-C-D-0\" class=\" edge-thickness-normal edge-pattern-solid flowchart-link LS-C LE-D\" style=\"fill:none;\" marker-end=\"url(#flowchart-pointEnd)\"></path><path d=\"M63.486488342285156,312.40541076660156L63.486488342285156,337.40541076660156L63.486488342285156,362.40541076660156\" id=\"L-D-E-0\" class=\" edge-thickness-normal edge-pattern-solid flowchart-link LS-D LE-E\" style=\"fill:none;\" marker-end=\"url(#flowchart-pointEnd)\"></path><path d=\"M63.486488342285156,403.00676345825195L63.486488342285156,428.00676345825195L63.486488342285156,453.00676345825195\" id=\"L-E-F-0\" class=\" edge-thickness-normal edge-pattern-solid flowchart-link LS-E LE-F\" style=\"fill:none;\" marker-end=\"url(#flowchart-pointEnd)\"></path></g><g class=\"edgeLabels\"><g class=\"edgeLabel\"><g class=\"label\" transform=\"translate(0, 0)\"><foreignObject width=\"0\" height=\"0\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"edgeLabel\"></span></div></foreignObject></g></g><g class=\"edgeLabel\"><g class=\"label\" transform=\"translate(0, 0)\"><foreignObject width=\"0\" height=\"0\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"edgeLabel\"></span></div></foreignObject></g></g><g class=\"edgeLabel\"><g class=\"label\" transform=\"translate(0, 0)\"><foreignObject width=\"0\" height=\"0\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"edgeLabel\"></span></div></foreignObject></g></g><g class=\"edgeLabel\"><g class=\"label\" transform=\"translate(0, 0)\"><foreignObject width=\"0\" height=\"0\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"edgeLabel\"></span></div></foreignObject></g></g><g class=\"edgeLabel\"><g class=\"label\" transform=\"translate(0, 0)\"><foreignObject width=\"0\" height=\"0\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"edgeLabel\"></span></div></foreignObject></g></g></g><g class=\"nodes\"><g class=\"node default default flowchart-label\" id=\"flowchart-A-20\" transform=\"translate(63.486488342285156, 20.300676345825195)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-63.486488342285156\" y=\"-20.300676345825195\" width=\"126.97297668457031\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-55.986488342285156, -12.800676345825195)\"><rect></rect><foreignObject width=\"111.97297668457031\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">专注力变化趋势</span></div></foreignObject></g></g><g class=\"node default default flowchart-label\" id=\"flowchart-B-21\" transform=\"translate(63.486488342285156, 110.90202903747559)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-59.878379821777344\" y=\"-20.300676345825195\" width=\"119.75675964355469\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-52.378379821777344, -12.800676345825195)\"><rect></rect><foreignObject width=\"104.75675964355469\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">初始阶段: 走神</span></div></foreignObject></g></g><g class=\"node default default flowchart-label\" id=\"flowchart-C-23\" transform=\"translate(63.486488342285156, 201.50338172912598)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-59.878379821777344\" y=\"-20.300676345825195\" width=\"119.75675964355469\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-52.378379821777344, -12.800676345825195)\"><rect></rect><foreignObject width=\"104.75675964355469\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">上升阶段: 一般</span></div></foreignObject></g></g><g class=\"node default default flowchart-label\" id=\"flowchart-D-25\" transform=\"translate(63.486488342285156, 292.10473442077637)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-59.878379821777344\" y=\"-20.300676345825195\" width=\"119.75675964355469\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-52.378379821777344, -12.800676345825195)\"><rect></rect><foreignObject width=\"104.75675964355469\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">高峰阶段: 专注</span></div></foreignObject></g></g><g class=\"node default default flowchart-label\" id=\"flowchart-E-27\" transform=\"translate(63.486488342285156, 382.70608711242676)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-59.878379821777344\" y=\"-20.300676345825195\" width=\"119.75675964355469\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-52.378379821777344, -12.800676345825195)\"><rect></rect><foreignObject width=\"104.75675964355469\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">下降阶段: 一般</span></div></foreignObject></g></g><g class=\"node default default flowchart-label\" id=\"flowchart-F-29\" transform=\"translate(63.486488342285156, 473.30743980407715)\"><rect class=\"basic label-container\" style=\"\" rx=\"0\" ry=\"0\" x=\"-59.878379821777344\" y=\"-20.300676345825195\" width=\"119.75675964355469\" height=\"40.60135269165039\"></rect><g class=\"label\" style=\"\" transform=\"translate(-52.378379821777344, -12.800676345825195)\"><rect></rect><foreignObject width=\"104.75675964355469\" height=\"25.60135269165039\"><div xmlns=\"http://www.w3.org/1999/xhtml\" style=\"display: inline-block; white-space: nowrap;\"><span class=\"nodeLabel\">稳定阶段: 一般</span></div></foreignObject></g></g></g></g></g></svg></div><p><span>通过以上分析和建议，希望您能够更好地理解和提升自己的专注力。如果您有任何疑问或需要进一步的帮助，请随时联系我。</span></p></div></div>\n" +
            "</body>\n" +
            "</html>";

            public static String md = "### 专注力检测报告\n" +
                    "\n" +
                    "#### 用户信息\n" +
                    "\n" +
                    "- **年龄**：21\n" +
                    "- **性别**：男\n" +
                    "- **行为**：短时间冥想\n" +
                    "\n" +
                    "#### 专注力数据分析\n" +
                    "\n" +
                    "#### 分析依据\n" +
                    "\n" +
                    "- **β/(α+θ)**：代表了大脑的认知参与度。比值上升表示认知参与度提高，即大脑在进行深度思考和活跃加工的同时，抑制无关的感觉输入。\n" +
                    "- **专注力状态分类**：\n" +
                    "  - **走神**：β/(α+θ) < 0.2\n" +
                    "  - **一般**：0.2 ≤ β/(α+θ) < 0.5\n" +
                    "  - **专注**：β/(α+θ) ≥ 0.5\n" +
                    "\n" +
                    "#### 专注力状态分类及各状态持续时间\n" +
                    "\n" +
                    "- 走神持续时间：30秒\n" +
                    "- 一般持续时间：40秒\n" +
                    "- 专注持续时间：8秒\n" +
                    "\n" +
                    "#### 专注力变化趋势\n" +
                    "\n" +
                    "- **总体趋势**：从开始的较低专注力逐渐上升到较高水平，然后在中间阶段达到峰值，随后逐渐下降并趋于稳定。\n" +
                    "- **具体变化**：\n" +
                    "  - **初始阶段**（前10秒）：专注力较低，处于走神状态。\n" +
                    "  - **上升阶段**（10-30秒）：专注力逐渐上升，进入一般状态。\n" +
                    "  - **高峰阶段**（30-40秒）：专注力达到最高，进入专注状态。\n" +
                    "  - **下降阶段**（40-50秒）：专注力逐渐下降，回到一般状态。\n" +
                    "  - **稳定阶段**（50-60秒）：专注力趋于稳定，保持在一般状态。\n" +
                    "\n" +
                    "#### 结果总览\n" +
                    "\n" +
                    "- **专注力得分**：根据专注力数值的变化，您的专注力得分在实验过程中表现出明显的波动。总体上，您在实验初期和末期的专注力较低，但在中间阶段达到了较高的专注水平。\n" +
                    "- **放松能力得分**：您的放松能力在实验初期和末期表现较好，但中间阶段由于专注力的提高，放松能力有所下降。\n" +
                    "\n" +
                    "#### 推荐解决方案\n" +
                    "\n" +
                    "- **个性化训练建议**：\n" +
                    "  - **冥想练习**：继续进行短时间冥想练习，以提高您的专注力和放松能力。建议每天进行10-15分钟的冥想，逐步增加时间。\n" +
                    "  - **注意力训练**：通过一些专门的注意力训练游戏或应用程序，如“专注森林”、“番茄工作法”等，来提高您的专注力。\n" +
                    "  - **环境调整**：在进行需要高度专注的任务时，尽量选择一个安静、无干扰的环境，减少外界干扰。\n" +
                    "  - **定期休息**：在长时间的工作或学习中，每隔一段时间进行短暂的休息，以恢复精力和注意力。\n" +
                    "\n" +
                    "#### 数据可视化\n" +
                    "\n" +
                    "```mermaid\n" +
                    "graph TD;\n" +
                    "    A[专注力变化趋势] --> B[初始阶段: 走神];\n" +
                    "    B --> C[上升阶段: 一般];\n" +
                    "    C --> D[高峰阶段: 专注];\n" +
                    "    D --> E[下降阶段: 一般];\n" +
                    "    E --> F[稳定阶段: 一般];\n" +
                    "```\n" +
                    "\n" +
                    "通过以上分析和建议，希望您能够更好地理解和提升自己的专注力。如果您有任何疑问或需要进一步的帮助，请随时联系我。";




}
