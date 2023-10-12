package part4.Task10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex","Jack","Aomine","li");

        Map<Integer, List<String>> groupNames = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Згруповані імена за довжиною:");
        groupNames.forEach((length, nameList) ->{
            System.out.println("Довжина " + length + ": " + nameList);
        });
    }
}
