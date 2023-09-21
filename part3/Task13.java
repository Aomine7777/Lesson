package part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task13 {
    public static void main(String[] args) {
        //13.	Write a program that reads a map of strings to integers (Map<String, Integer>) and sorts it by keys in ascending order
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();

        System.out.println("Введи строку та значення, для завершення введи (кінець)");

        while(true){
            String key = scanner.next();
            if(key.equals("кінець")){
                break;
            }
            int value = scanner.nextInt();

            map.put(key,value);

        }
        Map<String,Integer> sortedMap = new TreeMap<>(map);

        System.out.println("Карта відсортована по значенню:");
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
