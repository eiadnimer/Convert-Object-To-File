package org.example.formatter;

import org.example.core.Person;

public interface Formatter {
    String format(Person person);

    String extension();

    int choice();
}
