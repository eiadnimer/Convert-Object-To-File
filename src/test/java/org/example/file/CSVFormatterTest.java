package org.example.file;

import org.example.formatter.CSVFormatter;
import org.example.formatter.Formatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CSVFormatterTest {

    private final Formatter Formatter = new CSVFormatter();
    private final CSVFormatter csvFormatter = new CSVFormatter();

    @Test
    void the_choice_must_be_equal_to_the_class_choice() {
        int expectedChoice = Formatter.choice();
        int actualChoice = csvFormatter.choice();

        Assertions.assertEquals(expectedChoice, actualChoice);
    }

    @Test
    void the_extension_for_the_class_must_be_equal_to_json() {
        String expectedExtension = Formatter.extension();
        String actualExtension = csvFormatter.extension();

        Assertions.assertEquals(expectedExtension, actualExtension);
    }
}
