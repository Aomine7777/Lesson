package part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        //11.Write a program that uses a
        // list iterator to iterate through the elements of a list.
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(14);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
