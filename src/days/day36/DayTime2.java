package days.day36;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DayTime2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(dateTimeFormatter));
        DateTimeFormatter dateTimeFormatter1= DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(date.getYear());

    }
}
