package part2.Date;

import java.time.Instant;
import java.util.Date;

public class Task8 {
    public static void main(String[] args) {
    //•	Як отримати поточну дату в мілісекундах, використовуючи time API?
        Date localDate = new Date();
        Instant now = localDate.toInstant();
        System.out.println(now);
    }
}
