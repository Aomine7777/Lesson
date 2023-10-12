package part2.Date;

import java.time.LocalDate;

public class Task3 {
    //•	Як додати 1 місяць до поточної дати за допомогою time API?
    public static void main(String[] args) {
        LocalDate plusMonth = LocalDate.now().plusMonths(1);
        System.out.println(plusMonth);
    }
}
