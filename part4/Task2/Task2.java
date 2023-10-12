package part4.Task2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int minValue = Arrays.stream(array)
                .map(Math::abs)
                .min()
                .orElse(0);
        System.out.println("Найближче до нуля число за модулем : " + minValue);

        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);
    }


}
