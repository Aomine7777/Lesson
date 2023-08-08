package String.TaskT03N12;

public class Main {
    public static void main(String[] args) {
        //TaskT03N12 Дано предложение (слова разделены пробелами). Вернуть самое длинное слово
        String text12 = "Дано предложение слова разделены пробелами. Вернуть самое длинное слово";
        String result12 = findLongestWord(text12);
        System.out.println(result12);
    }
    public static String findLongestWord(String text12){
        String [] words12 = text12.split(" ");

        String longText12 = " ";

        for (String word: words12){
            if(words12.length > longText12.length()){
                longText12 = word;
            }
        }
        return longText12;
    }
}
