package part3;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        //14.	Write a program that reads a map of strings
        // to integers and sorts it by values in descending order.
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Введи строку та значення, для завершення введи (кінець)");

        while (true){
            String input = scanner.nextLine();
            if(input.equals("кінець")){
                break;
            }
            String[] parts = input.split(" ");
            if(parts.length == 2) {
                String key = parts[0];
                int value = Integer.parseInt(parts[1]);
                map.put(key,value);
            } else{
                System.out.println("Невірний формат");
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) ->entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Карта відсортована по значенню: ");
        for(Map.Entry<String,Integer> entry : list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
