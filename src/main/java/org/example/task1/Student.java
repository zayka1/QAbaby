package org.example.task1;

public class Student implements Printable{
    private String name;
    private int number;
    private int avgScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
