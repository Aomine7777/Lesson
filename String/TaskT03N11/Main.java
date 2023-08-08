package String.TaskT03N11;

public class Main {
    public static void main(String[] args) {
        //TaskT03N11 Дано предложение. Удалить все знаки препинания и все слова перевести в верхний регистр.
        String text11 = "Дано предложение. Удалить все знаки, препинания и все. слова перевести в верхний регистр.";
        String result = textChanger(text11);
        System.out.println(result);
    }
    public static String textChanger (String text11){
        String withoutPunctuation = text11.replaceAll("[^\\p{L}\\s]", "");
        String upperCaseText = withoutPunctuation.toUpperCase();
        return upperCaseText;
    }
}
