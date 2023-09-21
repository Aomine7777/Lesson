package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
    //Write a program that reads a list of integers and reverses it.
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.print("Введіть кількість чисел: ");
        int count = scanner.nextInt();

        System.out.println("Введіть числа:");
        for (int i = 0; i < count; i++ ){
            int number = scanner.nextInt();
            numbers.add(number);
        }
        Collections.reverse(numbers);

        System.out.println("Перевернутий список");
        for(Integer number : numbers) {
            System.out.println(number);
        }
        scanner.close();
    }
}
