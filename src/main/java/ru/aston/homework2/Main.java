package ru.aston.homework2;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new JsonReader().readStudents("/students.json");

        Optional<Integer> result = students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst();

        System.out.println(result.map(year -> "Book year: " + year).orElse("Book is missing"));
    }
}
