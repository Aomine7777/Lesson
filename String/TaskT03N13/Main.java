package String.TaskT03N13;

public class Main {
    public static void main(String[] args) {
        //TaskT03N13 Дана строка текста.
        // Нужно заменить в тексте первые буквы всех слов на заглавные и вернуть строку.
        String text13 = "Нужно заменить в тексте первые буквы всех слов на заглавные и вернуть строку";
        String result13 = changeWords13(text13);
        System.out.println(result13);
    }
    public  static String changeWords13(String text13 ){
        StringBuilder stringBuilder = new StringBuilder();
        String [] words13 = text13.split("\\s");

        for (String word : words13) {
            word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            stringBuilder.append(word).append(" ");
        }
        return  stringBuilder.toString();
    }
}
