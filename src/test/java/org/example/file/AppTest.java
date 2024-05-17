package org.example.file;

import org.example.core.App;
import org.example.formatter.Formatter;
import org.example.core.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    void format_and_save_file() {
        MockFileWriter mockFile = new MockFileWriter();
        MockFormatter mockFormatter = new MockFormatter();

        List<Formatter> formatters = new ArrayList<>();
        formatters.add(mockFormatter);

        App app = new App(formatters, mockFile);
        Person person = new Person("ahmad", "male", 1);
        app.run(1, person);

        Assertions.assertTrue(mockFile.isCalled());
        Assertions.assertTrue(mockFormatter.isExtensionCalled());
        Assertions.assertTrue(mockFormatter.isFormatCalled());
    }
}
