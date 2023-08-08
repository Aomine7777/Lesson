package String.TaskT03N04;

public class Main {
    public static void main(String[] args) {
        //TaskT03N04 Составить программу, которая вычисляет является ли заданное слово палиндромом. Палиндром - слово,
        // читающееся одинаково как с начала, так и с конца. Например, шалаш -> true, ананас -> false
        String str = "Шалаш";
        StringBuilder strRevers = new StringBuilder(str);
        strRevers.reverse();
        System.out.println(str.equalsIgnoreCase(strRevers.toString()));
    }
}
