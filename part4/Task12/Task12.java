package part4.Task12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> group = list.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println("Згруповані за парністю");

        System.out.println("Парні числа: " + group.get(true));
    }
}
