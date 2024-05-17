package org.example.file;

import org.example.formatter.JsonFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonFormatterTest {
    private final JsonFormatter jsonFormatter = new JsonFormatter();

    @Test
    void the_choice_must_be_equal_to_the_class_choice() {
        int actualChoice = jsonFormatter.choice();

        Assertions.assertEquals(1, actualChoice);
    }

    @Test
    void the_extension_for_the_class_must_be_equal_to_json() {
        String actualExtension = jsonFormatter.extension();

        Assertions.assertEquals("json",actualExtension);
    }
}
