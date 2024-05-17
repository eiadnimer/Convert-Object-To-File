package org.example.formatter;

import jakarta.xml.bind.JAXB;
import org.example.core.Person;

import java.io.StringWriter;

public class XMLFormatter implements Formatter {

    @Override
    public String format(Person person) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(person, sw);
        return sw.toString();
    }

    @Override
    public String extension() {
        return "xml";
    }

    @Override
    public int choice() {
        return 3;
    }
}
