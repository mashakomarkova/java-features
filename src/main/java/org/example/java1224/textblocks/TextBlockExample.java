package org.example.java1224.textblocks;

public class TextBlockExample {

    public static void main(String[] args) {
        textBlocks();
    }

    public static void beforeJava15() {
        String json = "{\n" +
                "    \"name\": \"Alice\",\n" +
                "    \"age\": 25\n" +
                "}";

        System.out.println(json);
    }

    public static void textBlocks() {
        String json = """
               {
                  "name":"Alice",
                  "age":25
               }
                """;
        System.out.println(json);

        String html = """
                <html>
                <body>
                <h1>Hello, World!</h1>
                </body>
                </html>
                """;
        System.out.println(html);
    }
}
