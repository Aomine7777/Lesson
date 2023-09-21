package part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    //5.	Write a program that reads a sentence and counts the frequency of each word using a map.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split(" ");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();


        for (String word : words) {

            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();


            if (!word.isEmpty()) {

                if (wordFrequencyMap.containsKey(word)) {

                    int frequency = wordFrequencyMap.get(word);
                    wordFrequencyMap.put(word, frequency + 1);
                } else {

                    wordFrequencyMap.put(word, 1);
                }
            }
        }

        System.out.println("Частота встречаемости слов в предложении:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

