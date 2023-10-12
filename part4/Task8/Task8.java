package part4.Task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Список без дублікатів: " + uniqueNumbers);
    }
}
