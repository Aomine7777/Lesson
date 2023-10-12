package part4.Task9;

import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = list.stream()
                .mapToInt(x -> x * x)
                .sum();

        System.out.println("Сума квадратів чисел: " + sum);
    }
}
