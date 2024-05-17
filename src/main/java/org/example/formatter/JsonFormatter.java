package org.example.formatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.core.Person;

import java.io.IOException;

public class JsonFormatter implements Formatter {

    @Override
    public String format( Person person) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String extension() {
        return "json";
    }

    @Override
    public int choice() {
        return 1;
    }
}
