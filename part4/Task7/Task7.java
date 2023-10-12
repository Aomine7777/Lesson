package part4.Task7;

import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 7, 2, 9, 3, 6, 8, 5);
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);

        System.out.println("Мінімальне число " + minNumber.get());
        System.out.println("Максимальне число " + maxNumber.get());
    }
}
