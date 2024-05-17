package org.example.file;

import lombok.Getter;
import org.example.formatter.Formatter;
import org.example.core.Person;

@Getter
public class MockFormatter implements Formatter {

    private boolean extensionCalled;
    private boolean formatCalled;

    @Override
    public String format( Person person) {
        formatCalled = true;
        return null;
    }

    @Override
    public String extension() {
        extensionCalled = true;
        return null;
    }

    @Override
    public int choice() {
        return 1;
    }

}
