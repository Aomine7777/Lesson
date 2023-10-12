package part4.Task11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","World");

        String result = words.stream()
                .collect(Collectors.joining(" "));
        System.out.println("Строка: " + result);
    }
}
