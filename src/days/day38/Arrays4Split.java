package days.day38;

import java.util.Arrays;

public class Arrays4Split {
    public static void main(String[] args) {
        String str = "Happy new year see you next year";
        //            Happy
        //            new
        //            year
        //            see
        //            you
        //            next
        //            year
        String[] splitStr = str.split(" ");
        System.out.println("splitStr.length = " + splitStr.length);
        System.out.println("Arrays.toString(splitStr) = " + Arrays.toString(splitStr));
        String text = "Ali said : Hello";
        String[] textSplit = text.split(":");
        System.out.println("textSplit.length = " + textSplit.length);
        System.out.println("textSplit[0] = " + textSplit[0]);
        String sentence = "Ali,Veli,Ronaldo,Messi played basketball and they ate something";
        //                 Ali
        //                 Veli
        //                 Ronaldo
        //                 Messi played basketball and they ate something
        String[] splitSentence1 = sentence.split(",");
        System.out.println("splitSentence1[0] = " + splitSentence1[0]);
        System.out.println("splitSentence1[1] = " + splitSentence1[1]);
        System.out.println("splitSentence1[2] = " + splitSentence1[2]);

        String result = "125-111";
        //               125
        //               111
        String[] resultSplit = result.split("-");
        System.out.println("resultSplit[1] = " + resultSplit[1]);
        result = "125-111-189-165";
        //        125
        //        111
        //        189
        //        165
        String[] splitResult2 = result.split("-");

        String club = "Hertha Berlin";
        String[] clubSplit = club.split(" ");
        System.out.println("clubSplit.length = " + clubSplit.length);
        System.out.println("Arrays.toString(clubSplit) = " + Arrays.toString(clubSplit));
        System.out.println("clubSplit[1] = " + clubSplit[1]);

        String[] clubs = {"Real Madrid", "Hertha Berlin", "Sporting Lisbon", "Sparta Praque","Borussia Dortmund"};
        System.out.println("clubs.length = " + clubs.length);
//        String[] footbballCities = new String[4];//Madrid Berlin Lisbon Praque
        String[] footbballCities = new String[clubs.length];//Madrid Berlin Lisbon Praque
        int counter = 0;
        for (String c : clubs) {
            System.out.println(c.split(" ")[1]);
            String[] forCity = c.split(" ");
            System.out.println("forCity[1] = " + forCity[1]);
            footbballCities[counter] = forCity[1];
            counter++;
        }
        System.out.println("Arrays.toString(footbballCities) = " + Arrays.toString(footbballCities));


    }
}
