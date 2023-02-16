package days.day68;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class NumberPlateGeneratorTask {


    public static void main(String[] args) {

        numberPlateGeneration("TT", "01/04/2011");
    }


    public static String numberPlateGeneration(String memoryTag, String dateStr) {

        String plate = "";
        String ageIdentifier;
        String randomLetters;

        ////////// AGE Identifier ////////////////

        //Create the DateTimeFormatter matching the input string format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Using parse method to convert the string to LocalDate object
        LocalDate date = LocalDate.parse(dateStr, format);

        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());

        int month = date.getMonthValue();
        int year = date.getYear();

        if (month < 3) {
            ageIdentifier = String.valueOf(year + 49).substring(2);
        } else if (month < 9) {
            ageIdentifier = String.valueOf(year).substring(2);
        } else {
            ageIdentifier = String.valueOf(year + 50).substring(2);
        }

        ////////// 3 Random Letter ////////////////
       randomLetters = generateLetter()+generateLetter()+generateLetter();
        // TODO check this letters same with previous run or not , use file import export features!!!

        plate= memoryTag+ageIdentifier+" "+randomLetters;

        // TODO dont forget store your unique generated plate to your file!!!
        return plate;
    }


    public static String generateLetter(){
        Random random = new Random();
        char randomChar;
        do{
            randomChar= (char)(random.nextInt(26)+65);
        }while (randomChar == 'I' || randomChar == 'Q');

        return ""+randomChar;
    }

}
















