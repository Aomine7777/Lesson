package part5.Task13;

import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    //13. Використовуючи flatMap розділити список рядків на окремі символи, а потім зібрати їх у єдиний список символів.
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Java");

        List<Character> characters = strings.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());

        System.out.println(characters);
    }
}
