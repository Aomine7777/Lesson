package part4.Task13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aomine","Alex","BoB");

        String string = list.stream()
                .collect(Collectors.joining(", або ;"));
        System.out.println("Строка: " + string);
    }
}
