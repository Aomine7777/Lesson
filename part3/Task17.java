package part3;

import java.util.ArrayList;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        //17.	Write a program that converts an array of integers to a list.
        int[] arr = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }
        System.out.println(list);
    }
}
