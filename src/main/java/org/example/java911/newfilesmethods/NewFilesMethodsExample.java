package org.example.java911.newfilesmethods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewFilesMethodsExample {

    public static void main(String[] args) throws IOException {
       Path filePath = Path.of("example.txt");
//        Files.writeString(filePath, "Hello, Java 11!");
//        System.out.println("File written successfully.");

        String content = Files.readString(filePath);
        System.out.println("File Content: " + content);

        Files.writeString(filePath, "\nAppending new content!", StandardOpenOption.APPEND);
        System.out.println("Text appended successfully.");
    }

    public void writeToFileBeforeJava11() {
        String content = "Hello, Java!";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
