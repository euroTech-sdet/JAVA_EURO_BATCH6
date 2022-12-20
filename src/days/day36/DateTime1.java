package days.day36;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear());
// 2022-birthyear
        yourAge(1980);
        // year month day    : day month year
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM-yyyy");
        System.out.println(date.format(dateTimeFormatter));
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM-yyyy");
        System.out.println(localDateTime.format(dateTimeFormatter));
        Period period=Period.of(1970,5,7);
        System.out.println(period.subtractFrom(date));
        LocalDate birthYear=LocalDate.parse("18/10-1970",dateTimeFormatter);
        Period period1=Period.between(birthYear,date);
        System.out.println(period1.getYears());


    }

    public static void yourAge(int birthYear) {
        int age = 2022 - birthYear;
        LocalDate date = LocalDate.now();
        System.out.println("your age = " + (date.getYear() - birthYear));
    }
}
