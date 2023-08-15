package Part2.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Task9 {
    public static void main(String[] args) {
        //Як отримати поточну дату за місцевим часом у мілісекундах, використовуючи time API?
        Date localDate = new Date();
        Instant now = localDate.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, zoneId);
        System.out.println(localDateTime);

    }
}
