package ru.aston.homework2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new JsonReader().readStudents("/students.json");
        new BookService().printFirstBookYear(students);
    }
}