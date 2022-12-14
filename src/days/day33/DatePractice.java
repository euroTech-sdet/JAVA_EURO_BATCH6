package days.day33;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatePractice {


    public static void main(String[] args) throws ParseException {

        Date date1 = new Date();

        System.out.println(date1);

        System.out.println("date.getTime() = " + date1.getTime());


        //Age identifiers are the last two digits of the year between March and August, or the last two digits plus
        ////    50 if between September and February (registration years can be thought of starting in March). So,
        ////    for 12th of March 2018, it is “18” and for the 27th of February 2019, it is “68” (not “69”). The random
        ////    letters can be any except “I” and “Q”.

//        inputMap.put("YC", "04/07/2019");

//        if(monthValue < 3){
//            ageIdentifier= String.valueOf(yearValue+49).substring(2);
//        } else if (monthValue<9){
//            ageIdentifier= String.valueOf(yearValue).substring(2);
//        } else{
//            ageIdentifier= String.valueOf(yearValue+50).substring(2);
//        }

        String inputDate = "20/12/2022";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(inputDate, format);

        System.out.println("date = " + date);

        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());


        //////////////////////

//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date2= formatter.parse(inputDate);
//
//        LocalDate localDate= date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        System.out.println("localDate.getMonth() = " + localDate.getMonth());


        inputDate = "20/12/22";

        format = DateTimeFormatter.ofPattern("dd/MM/yy");

        date = LocalDate.parse(inputDate, format);

        System.out.println("date = " + date);

        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getYear() = " + date.getYear());

    }
}
