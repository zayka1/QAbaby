package org.example;

import task1.Book;
import task1.Student;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("Толстой");
        book.setTitle("Война и мир");
        book.setYear(1867);
        book.display();

        Student student = new Student();
        student.setName("Mike");
        student.setNumber(777);
        student.setAvgScore(4);
        student.print();
    }
}