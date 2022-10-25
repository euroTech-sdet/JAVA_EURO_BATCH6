package days.day4;

public class DeclarationSamples {


    public static void main(String[] args) {

        // MULTI DECLARATION

//        double pi;
//        double conversionRate;
//        double temperature;
//        pi = 3.14;
//        conversionRate = 0.25;
//        temperature = 20.1;

        // if all your data type are SAME!!!, then u can declare them in 1 shot with comma separation

//        double pi, conversionRate, temperature;
//        pi = 3.14;
//        conversionRate = 0.25;
//        temperature = 20.1;

        // Declare and assign all of them in 1 line

        double pi = 3.14, conversionRate = 0.25, temperature = 20.1;

        float rate2= 2.5f;

        //////////////////////////////////////////

//        int idNumber;
//        double rate;

//        int idNumber, double rate; THIS IS WRONG ERROR!!!!

        int idNumber, rate;

        idNumber = 10001;
//        rate = 1.25; //  ERROR !!!!

        //////////////////////////////////////////


        System.out.println(pi);
        System.out.println(conversionRate);
        System.out.println(temperature);

        System.out.println(pi +"    "+ conversionRate +"      "+ temperature);


    }
}
