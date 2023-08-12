package Part2.Date;

import java.time.LocalDate;

public class Task5 {
    public static void main(String[] args) {
        LocalDate plusTenYear = LocalDate.now().plusYears(10);
        System.out.println(plusTenYear);
    }
}
