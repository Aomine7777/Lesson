package part4.Task17;

import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,4,6,8,10,12,14);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Чи всі єлементи парні? " + allEven);
        boolean moreTwelve = numbers.stream().anyMatch(n -> n > 12);
        System.out.println("Чи є елементи більше за 12? " + moreTwelve);
    }
}
