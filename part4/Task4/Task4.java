package part4.Task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9,10,};

        Integer [] newArray = Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("Парні числа:");
        for (Integer number: newArray){
            System.out.println(number + " ");
        }

    }
}
