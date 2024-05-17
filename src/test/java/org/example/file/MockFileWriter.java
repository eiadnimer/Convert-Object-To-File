package org.example.file;

import lombok.Getter;
import org.example.file.writer.FileWriter;

@Getter
public class MockFileWriter implements FileWriter {
    private boolean called;
    @Override
    public void write(String content, String extension) {
        called = true;
    }
}
