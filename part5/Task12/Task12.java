package part5.Task12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    //12. Скласти список списків рядків (List<List<String>>) в один список використовуючи flatMap.*
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("Рядок 1.1");
        list1.add("Рядок 1.2");

        List<String> list2 = new ArrayList<>();
        list2.add("Рядок 2.1");
        list2.add("Рядок 2.2");
        list2.add("Рядок 2.3");

        listOfLists.add(list1);
        listOfLists.add(list2);

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        flatList.forEach(System.out::println);
    }
}

