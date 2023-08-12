package Part2.Date;

import java.time.LocalDate;

public class Task3 {
    public static void main(String[] args) {
        LocalDate plusMonth = LocalDate.now().plusMonths(1);
        System.out.println(plusMonth);
    }
}
