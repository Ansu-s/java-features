package org.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadWriteString {
    public static void main(String[] args) throws IOException {
        String path = "D:\\file.txt" ;
        Files.writeString(Path.of(path), "Hello this is inserted", StandardOpenOption.APPEND);

        String fileread = Files.readString(Path.of(path));
        System.out.println(fileread);
    }
}
