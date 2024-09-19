package task2.Student;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Student student = new Student("Ivan", 1);
        Student student1 = new Student("Alex", 2);
        Student student2 = new Student("Mike", 3);


        manager.addStudent(student);
        manager.addStudent(student1);
        manager.addStudent(student2);

        manager.printStudents();

        manager.deleteStudent(3);
        System.out.println();
        manager.printStudents();

    }
}
