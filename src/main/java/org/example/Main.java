package org.example;

import task1.Book;
import task1.Student;
import task1.Watch;

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

        Watch watch = new Watch();
        watch.setHours(12);
        watch.setMinutes(22);
        watch.setSeconds(59);
        watch.read();
    }
}