package org.example.file;

import org.example.formatter.Formatter;
import org.example.formatter.XMLFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XMLFormatterTest {

    private final Formatter Formatter = new XMLFormatter();
    private final XMLFormatter xmlFormatter = new XMLFormatter();

    @Test
    void the_choice_must_be_equal_to_the_class_choice() {
        int expectedChoice = Formatter.choice();
        int actualChoice = xmlFormatter.choice();

        Assertions.assertEquals(expectedChoice, actualChoice);
    }

    @Test
    void the_extension_for_the_class_must_be_equal_to_json() {
        String expectedExtension = Formatter.extension();
        String actualExtension = xmlFormatter.extension();

        Assertions.assertEquals(expectedExtension, actualExtension);
    }
}
