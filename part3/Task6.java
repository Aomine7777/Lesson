package part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
    //6.	Write a program that allows users to add, retrieve, and remove contacts using a map. – кастомний клас Contact(name, phoneNumber) ,
    // нескінченний цикл в мейні, юзеру пропонується обрати операцію (додати, прочитати чи видалити контакт)
        String name;
        String phoneNumber;

        Map<Integer, Student> contactsStudent = new HashMap<>();
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Меню");
            System.out.println("Обери 1, якщо бажаешь додати контакт");
            System.out.println("Обери 2, якщо бажаешь отримати контакт");
            System.out.println("Обери 3, якщо бажаешь видалити контакт");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice){
                case 1:
                    System.out.println("Введи номер студента: ");
                    int numberStudent = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введи ім'я контакту: ");
                    name = scanner.nextLine();
                    System.out.println("Введи номер телефону: ");
                    phoneNumber = scanner.nextLine();
                    Student student = new Student(name, phoneNumber);
                    contactsStudent.put(numberStudent, student);
                    System.out.println("Номер успішно додан в записну книгу");
                    break;
                case 2:
                    System.out.println("Введи номер студента якого хочешь отримати");
                    int numberToRetrive = scanner.nextInt();
                    if(contactsStudent.containsKey(numberToRetrive)){
                        Student studentToRetrive = contactsStudent.get(numberToRetrive);;
                        System.out.println(studentToRetrive + " був відображений із контактів" );
                    } else {
                        System.out.println("Контакт не знайдено");
                    }
                    break;
                case 3:
                    System.out.println("Введи номер студента якого бажаєш видалити");
                    int numberToRemove = scanner.nextInt();
                    if (contactsStudent.containsKey(numberToRemove)){
                        contactsStudent.remove(numberToRemove);
                        System.out.println("Контакт успішно видаленний");
                    } else{
                        System.out.println("Контакт не знайдено");
                    }
                    break;

            }

        }

    }

    static class Student {
        private String name;
        private String number;


        public Student(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

        public String toString() {
            return "Им'я: " + name + ", Номер: " + number;
        }
    }
}

