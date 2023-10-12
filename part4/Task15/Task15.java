package part4.Task15;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9,10,};

        Integer [] newArray = Arrays.stream(array)
                .filter(number -> number % 2 != 0)
                .limit(3)
                .map(number -> number * number)
                .toArray(Integer[]::new);
        System.out.println("Непарні числа:");
        for (Integer number: newArray){
            System.out.println(number + " ");
        }

    }
}
