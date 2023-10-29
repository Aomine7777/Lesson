package part5.Task17;

import java.util.ArrayList;
import java.util.List;

public class Task17 {
    //17. Створити програму на Java, яка демонструє використання wildcard generics для прийняття та друку елементів зі списку невідомих типів.
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        System.out.println("Integer List:");
        printList(integerList);

        System.out.println("String List:");
        printList(stringList);

        System.out.println("Double List:");
        printList(doubleList);
    }
}
