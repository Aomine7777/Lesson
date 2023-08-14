package Part2.Date;

import java.time.LocalDate;

public class Task1 {
    //•	Як отримати поточну дату за допомогою time API з Java 8?
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
