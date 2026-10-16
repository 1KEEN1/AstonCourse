package ru.aston.homework2;

import java.util.Comparator;
import java.util.List;

public class BookService {
    public static final int MIN_YEAR = 2000;
    public static final int BOOK_LIMIT = 3;

    public void printFirstBookYear(List<Student> students) {
        students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > MIN_YEAR)
                .limit(BOOK_LIMIT)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Year: " + year),
                        () -> System.out.println("Book is missing")
                );
    }
}
