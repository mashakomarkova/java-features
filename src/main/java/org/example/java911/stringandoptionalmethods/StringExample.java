package org.example.java911.stringandoptionalmethods;

public class StringExample {

    public static void main(String[] args) {
        System.out.println("".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("Java".isBlank());

        String multiLine = "Java 11\nNew String Methods\nHello World";
        multiLine.lines().forEach(System.out::println);

        String text = "   Java 11   ";
        System.out.println("[" + text.strip() + "]");
        System.out.println("[" + text.stripLeading() + "]");
        System.out.println("[" + text.stripTrailing() + "]");

        String star = "*";
        System.out.println(star.repeat(5));
    }
}
