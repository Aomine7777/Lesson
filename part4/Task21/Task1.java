package part4.Task21;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        int sum = list.stream()
                .filter(x -> isPrime(x) && x % 2 != 0)
                .mapToInt(x -> x * x)
                .sum();

        System.out.println("Сума квадратів простих чисел: " + sum);
    }
}
