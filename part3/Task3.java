package part3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //3.	Write a program that converts a list of strings to an array of strings.
    public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("j");
            list.add("a");
            list.add("v");
            list.add("a");
            String [] array = list.toArray(new String[list.size() - 2]);

            for (String ar: array){
                System.out.println(ar);
            }
    }
}
