package Part2.Date;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate plusWeek = LocalDate.now().plusWeeks(1);
        System.out.println(plusWeek);
    }
}
