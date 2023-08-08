package String.TaskT03N08;

public class Main {
    public static void main(String[] args) {
        //TaskT03N08 Иногда в работе со строками приходится использовать спец символы. Например это символ переноса строки, табуляции, кавычек.
        // Для их написания в коде используется экранирование (escape sequence).
        //Задание: написать программу, которая выводит на экран:
        //Hi!
        //Do you love use smile? "¯\_(ツ)_/¯"
        //При этом программа должна использовать только один System.out.print. Обратите внимание на перенос строки и кавычки. Тесты писать не нужно.
        System.out.println("Hi! \nDo you love use smile? \"¯\\_(ツ)_/¯\"");
    }
    public static String getColor (int number){

        return "\u001b[3" + number + "m";
    }
}
