package String.TaskT03N07;

public class Main {
    public static void main(String[] args) {
        //TaskT03N07 Дано предложение. Поменять местами его первое и последнее слово.
        //Изучить метод String.split
        String sitt =  "Поменять местами его первое и последнее слово";
        String [] words = sitt.split(" ");
        String firstWord = words [0];
        words [0] = words[words.length - 1];
        words [words.length -1] = firstWord;
        for (String word : words) {
            System.out.println(word + " ");
        }
    }
}
