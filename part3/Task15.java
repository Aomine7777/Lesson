package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        //15.	Write a program, that creates subList of a list.
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        System.out.println("List: " + list);

        List<String> sublist = list.subList(2,4);
        System.out.println("Sublist(2,4): " + sublist);
    }
}
