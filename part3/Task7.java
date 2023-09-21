package part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Map<Integer, Student> studentDateBase = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Обери 1, якщо бажаешь додати студента");
            System.out.println("Обери 2, якщо бажаешь видалити студента");
            System.out.println("Обери 3, якщо бажаешь отримати студента");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    System.out.println("Введи номер студента: ");
                    int numberStudent = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введи ім'я студента: ");
                    String name = scanner.nextLine();
                    System.out.println("Введи вік студнета: ");
                    int age = scanner.nextInt();
                    System.out.println("Введи средний бал");
                    double averageMark = scanner.nextDouble();

                    Student student = new Student(name, age, averageMark);
                    studentDateBase.put(numberStudent, student);
                    System.out.println("Студент успішно додан");
                    break;
                case 2:
                    System.out.println("Введи номер студента якого бажаєш видалити");
                    int numberToRemove = scanner.nextInt();
                    if (studentDateBase.containsKey(numberToRemove)) {
                        studentDateBase.remove(numberToRemove);
                        System.out.println("Студент успішно видалений з системи");
                    } else {
                        System.out.println("Студента з таким номером немає в системі");
                    }
                    break;
                case 3:
                    System.out.println("Введи номер студента для відображення інформації");
                    int numberToRetrive = scanner.nextInt();
                    if (studentDateBase.containsKey(numberToRetrive)) {
                        Student studentToRetrive = studentDateBase.get(numberToRetrive);
                        System.out.println("Інформація " + studentToRetrive);
                    } else {
                        System.out.println("Студента з таким номером немає в системі");
                    }
                    break;
            }
        }
    }

    static class Student {
        private String name;
        private int age;
        private double averageMark;

        public Student(String name, int age, double averageMark) {
            this.name = name;
            this.age = age;
            this.averageMark = averageMark;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getAverageMark() {
            return averageMark;
        }

        public String toString() {
            return "Им'я: " + name + ", Вік: " + age + ", Середній бал: " + averageMark;
        }
    }
}