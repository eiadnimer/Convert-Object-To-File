package org.example.core;

import org.example.file.writer.FileWriter;
import org.example.formatter.Formatter;

import java.util.List;

public class App {
    private final List<Formatter> formatters;
    private final FileWriter fileWriter;
    public App(List<Formatter> formatters, FileWriter fileWriter) {
        this.formatters = formatters;
        this.fileWriter = fileWriter;
    }

    public void run(int choice, Person person) {
        boolean found = false;
        Formatter formatter = null;
        for (Formatter f : formatters) {
            if (f.choice() == choice) {
                found = true;
                formatter = f;
                break;
            }
        }
        if (found) {
            String content = formatter.format(person);
            String extension = formatter.extension();
            fileWriter.write(content, extension);
            System.out.println("done");
        } else {
            System.out.println("invalid choice");
        }

    }
}

