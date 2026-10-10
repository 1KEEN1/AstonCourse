package ru.aston.homework2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    List<Book> books = new ArrayList<>();

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Student() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentBooks=" + books +
                '}';
    }
}
