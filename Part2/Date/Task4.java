package Part2.Date;

import java.time.LocalDate;

public class Task4 {
    public static void main(String[] args) {
        LocalDate plusYear = LocalDate.now().plusYears(1);
        System.out.println(plusYear);
    }
}
