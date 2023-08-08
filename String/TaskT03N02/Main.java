package String.TaskT03N02;

public class Main {
    public static void main(String[] args) {
        //TaskT03N02 Дано слово. Верно ли, что оно начинается и оканчивается на одну букву?
        String str = "Шалаш";
        System.out.println(str.toLowerCase().charAt(0) == str.toLowerCase().charAt(str.length() -1));
    }
}
