package days.day25;

public class Capitals {
    public static void main(String[] args) {

        //Norway, England,Turkiye,Germany,Italy,Spain
        //Oslo, London, Ankara,Berlin,Roma,Madrid--->return capital
        capital("Norway");
        capital("England");
        String capitalOfTurkiye = capital("Turkiye");
        System.out.println("capitalOfTurkiye = " + capitalOfTurkiye);
        String capitalOfGermany = capitalReturn("Germany");
        System.out.println("capitalOfGermany = " + capitalOfGermany);
        String italy = capitalReturn("Italy");
        System.out.println("italy = " + italy);
        capitalReturn("Norway");


    }

    public static String capital(String country) {
        String capital1 = "";
        switch (country) {
            case "Norway":
                capital1 = "Oslo";
                break;
            case "England":
                capital1 = "London";
                break;
            case "Turkiye":
                capital1 = "Ankara";
                break;
            case "Germany":
                capital1 = "Berlin";
                break;
            case "Italy":
                capital1 = "Roma";
                break;
            case "Spain":
                capital1 = "Madrid";
                break;
            default:
                capital1 = "not found";
        }
        System.out.println("capital1 = " + capital1);
        return capital1;
    }

    public static String capitalReturn(String country) {
        String capital = "";
        switch (country) {
            case "Norway":
                System.out.println("\"Oslo\" = " + "Oslo");
                return "Oslo";
            case "England":
                return "London";
            case "Turkiye":
                return "Ankara";
            case "Germany":
                return "Berlin";
            case "Italy":
                return "Roma";
            case "Spain":
                return "Madrid";
            default:
                return "not found";
        }
    }
}
