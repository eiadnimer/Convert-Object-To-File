package org.example.file.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OSFileWriter implements FileWriter {
    @Override
    public void write(String formattedContent, String extension) {
        try {
            Path path = Paths.get("./convert." + extension);
            byte[] strToBytes = formattedContent.getBytes();
            Files.write(path, strToBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
