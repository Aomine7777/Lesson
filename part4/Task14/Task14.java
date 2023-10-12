package part4.Task14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Li","BOB","Alex","Aomine");

        Optional<String> longestWord = list.stream()
                .max((word1,word2) -> Integer.compare(word1.length(),word2.length()));
        System.out.println("Найдовше слово: " + longestWord.get());
    }
}
