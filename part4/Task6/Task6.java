package part4.Task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};

        int sum = Arrays.stream(number)
                .sum();

        System.out.println("Сумма чисел: " + sum);
    }
}
