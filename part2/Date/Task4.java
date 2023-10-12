package part2.Date;

import java.time.LocalDate;

public class Task4 {
    //•	Як додати 1 рік до поточної дати за допомогою time API?
    public static void main(String[] args) {
        LocalDate plusYear = LocalDate.now().plusYears(1);
        System.out.println(plusYear);
    }
}
