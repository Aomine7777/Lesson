package part3;


import java.util.HashSet;
import java.util.Set;

public class Task2 {
    //2.	Write a program that performs set operations like union,
    // intersection, and difference on two sets.
    public static void main(String[] args) {
     Set<Integer> set1 = new HashSet<>();
     Set<Integer> set2 = new HashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);
    set2.add(2);
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);

    Set<Integer> union = new HashSet<>(set1);
    union.addAll(set2);
    System.out.println("Union " + union);

    Set<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);
    System.out.println("Intersection " + intersection);

    Set<Integer> difference = new HashSet<>(union);
    difference.removeAll(intersection);
    System.out.println("Difference " + difference);
    }

}
