package part2.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task7 {
    //•	Як отримати другу суботу поточного місяця, використовуючи time API?
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate year = LocalDate.of(localDate.getYear(), localDate.getMonth(),1);
        LocalDate secondSaturday = year.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(secondSaturday);
    }
}
