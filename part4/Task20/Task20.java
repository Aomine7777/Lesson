package part4.Task20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task20 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Aomine","Alex","Li");

        List<String> filterWords = words.stream()
                .filter(word -> word.length() < 5)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        filterWords.forEach(System.out::println);
    }
}
