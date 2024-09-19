package task2.Student;

import task2.Student.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    public void addStudent(Student student){
        list.add(student);
    }
    public void deleteStudent(int ID){
        Student studentDeleted = null;
        for (Student student:list) {
            if (student.getID() == ID){
                studentDeleted = student;
                list.remove(studentDeleted);
                break;
            }
        }
    }

    public void printStudents(){
        for (Student student:list){
            System.out.println(student.toString());
        }
    }
}
