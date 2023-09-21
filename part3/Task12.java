package part3;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        //12.	Write a program that demonstrates basic operations on a LinkedHashSet, TreeSet (adding, checking for containment),
        // LinkedHashMap, TreeMap (putting and getting key-value pairs).

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Alex");
        linkedHashSet.add("Jack");
        linkedHashSet.add("Bob");

        System.out.println(linkedHashSet.contains("Alex"));
        System.out.println(linkedHashSet.contains("Jack"));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(9);
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet.contains(7));
        System.out.println(treeSet.contains(9));
        System.out.println(treeSet);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Alex");
        linkedHashMap.put(2,"Jack");
        linkedHashMap.put(3,"Bob");
        System.out.println(linkedHashMap.containsKey(2));
        System.out.println(linkedHashMap.containsValue("Alex"));
        System.out.println(linkedHashMap.get(2));
        System.out.println(linkedHashMap);

        Map<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("Alex",1);
        treeMap.put("Bob",2);
        treeMap.put("Tom",3);
        System.out.println(treeMap.containsKey("Alex"));
        System.out.println(treeMap.containsValue(4));
        System.out.println(treeMap.get("Bob"));

    }
}
