package part4.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","Alex","Jame","Jack");

        List<String> uppercaseName = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Імена в аперкейсі");
        System.out.println(uppercaseName);
    }
}
