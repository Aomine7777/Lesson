package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        //8.	Write a program that sorts a list of student objects based on their average mark in descending order – клас Student, 2 поля – name, age, averageMark.
        List<Student> students = new ArrayList<>();
        students.add(new Student("Олексій",24, 88.8));
        students.add(new Student("Марія",20, 66.6));
        students.add(new Student("Олександра",17, 99.9));
        students.add(new Student("Артем",24, 55.5));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAverageMark(), s1.getAverageMark());
            }
        });
        for (Student student : students){
            System.out.println(student);
        }

    }

    static class Student{
        private String name;
        private int age;
        private double averageMark;

        public Student (String name, int age, double averageMark){
            this.name = name;
            this.age = age;
            this.averageMark = averageMark;
        }

        public double getAverageMark() {
            return averageMark;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", averageMark=" + averageMark +
                    '}';
        }
    }
}
