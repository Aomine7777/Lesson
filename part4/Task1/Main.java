package part4.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        group.addStudent(new Student("ALex", 24, 1, "Computer Science"));
        group.addStudent(new Student("Jack", 24, 1, "Computer Science"));
        group.addStudent(new Student("Jon", 24, 1, "Computer Science"));
        group.addStudent(new Student("Li", 24, 1, "Computer Science"));


        List<Student> studentsByName = group.getStudentsByName('A');
        System.out.println("Студенти, ім'я починається з 'А': " + studentsByName);

        List<Student> studentsByCourse = group.getStudentsByCourse(1);
        System.out.println("Студенти на першому курсі: " + studentsByCourse);
    }


}
