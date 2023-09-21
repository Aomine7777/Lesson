package part3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    //1.	Write a program that demonstrates basic operations on a list such as adding,
    // removing, and retrieving elements.
    public static void main(String[] args) {
        List<String>  list = new ArrayList<String>(10);

        list.add("firstList");
        list.add("secondList");
        list.remove(1);
        System.out.println(list.get(0));

    }
}
