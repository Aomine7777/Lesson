package part4.Task18;

import java.util.List;
import java.util.Optional;

public class Task18 {
    public static void main(String[] args) {
        List<String> list = List.of("one","two","three","four","five","six","seven");

        Optional<String> firstElement = list.stream().findFirst();
        if (firstElement.isPresent()){
            System.out.println("Перший елемент: " + firstElement.get());
        }else{
            System.out.println("Список порожній");
        }
        Optional<String> lastElement = list.stream().reduce((first, second) -> second);
        if (lastElement.isPresent()){
            System.out.println("Останній елемент: " + lastElement.get());
        } else {
            System.out.println("Список порожній");
        }
    }
}
