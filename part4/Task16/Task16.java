package part4.Task16;

import java.util.Arrays;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0);

        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Середнє значення: " + average);
    }
}
