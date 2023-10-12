package part4.Task22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task22 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int result = list.parallelStream()
                .filter(x -> x >4)
                .mapToInt(number-> number * number)
                .sum();

        System.out.println("Сумма квадратів чисел, більших за 4 " + result);
    }
}
