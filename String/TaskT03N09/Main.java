package String.TaskT03N09;

public class Main {
    public static void main(String[] args) {
        //TaskT03N09
        //Задание: на вход приходит число от 0 до 7. Вывести на экран надпись “Hello java guys” в соответствующем цвете. Опционально: изменить фон текста.
        //Тест писать не нужно.
        String text = "Hello java guys";
        int number = 5;
        String coloredText = getColor(number) + text + getResset();
        System.out.println(coloredText);
    }
    public static String getColor (int number){

        return "\u001b[3" + number + "m";
    }
    public static String getResset (){
        return "\u001b[0m";
    }
}
