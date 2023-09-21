package part3;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        //Write a program that reads a list of integers and removes duplicates using a set.
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введи список чисел");
        int input;
        while ((input = scanner.nextInt()) != -1){
            numbers.add(input);
        }

        Set<Integer> unique = new HashSet<>(numbers);

        numbers.clear();
        numbers.addAll(unique);

        System.out.println("Список без дупликатов:");
        for (Integer number : numbers){
            System.out.println(number + " ");
        }
    }
}
