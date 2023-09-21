package part3;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    //4.	Write a program that demonstrates basic operations on a map such as adding, updating, and retrieving entries.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 1);
        map.put("Jon", 2);
        map.put("Tom", 3);
        System.out.println("Adding " + map);


        map.put("Jon", 7);
        System.out.println("Updating " + map);

        String name = "Alex";
        System.out.println("Retrieving " + map.get(name));

    }
}
