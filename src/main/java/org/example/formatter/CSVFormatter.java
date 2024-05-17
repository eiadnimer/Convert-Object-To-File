package org.example.formatter;

import org.example.core.Person;

public class CSVFormatter implements Formatter {
    @Override
    public String format(Person person) {
        return person.getName() + "," + person.getGender() + ", " + person.getId();
    }

    @Override
    public String extension() {
        return "csv";
    }

    @Override
    public int choice() {
        return 2;
    }
}
