package org.example;
import org.example.core.App;
import org.example.file.writer.OSFileWriter;
import org.example.core.Person;
import org.example.file.writer.FileWriter;
import org.example.formatter.CSVFormatter;
import org.example.formatter.Formatter;
import org.example.formatter.JsonFormatter;
import org.example.formatter.XMLFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Formatter> formatters = new ArrayList<>();
        formatters.add(new JsonFormatter());
        formatters.add(new CSVFormatter());
        formatters.add(new XMLFormatter());
        FileWriter file = new OSFileWriter();
        while (true) {
            App app = new App(formatters, file);
            Person person = new Person("eiad", "male", 1);
            System.out.println(" Welcome to my application\n" +
                    "        1- Convert object to Json file\n" +
                    "        2- Convert object to CSV file\n" +
                    "        3- Convert object to XML file\n" +
                    "        4- exit");
            System.out.println(" Please enter your choice ");
            int choice = scanner.nextInt();
            if (choice == 4){
                System.out.println("thanks");
                break;
            }
            app.run(choice, person);
        }
    }
}
