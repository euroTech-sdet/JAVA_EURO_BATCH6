package days.day14;

public class Days {
    public static void main(String[] args) {
        // monday 1  tuesday 2 wednesday 3 thursday 4
        int dayNumber = 4;
//

        if (dayNumber > 5) {
            int insideIf = 5;// local variable you can use it inside the if block
            // if you want to use it out of the if block then you will create it out of if block


            insideIf = 20;
        }
        String today = "";
        switch (dayNumber) {
            case 7:
                System.out.println("today is sunday");
                today = "Sunday";
                break;
            case 6:
                System.out.println("today is saturday.");
                today = "Saturday";
                break;
            case 5:
                System.out.println("today is friday.");
                today = "Friday";
                break;
            case 4:
                System.out.println("today is thursday");
                today = "Thursday";
                break;
            case 3:
                System.out.println("today is wednesdday");
                today = "Wednesday";
                break;
            case 2:
                System.out.println("today is tuesday.");
                today = "Tuesday";
                break;
            case 1:
                System.out.println("today is monday.");
                today = "Monday";
                break;
            default:
                System.out.println("the number is out of day.number value didnt match");
        }
        System.out.println("out of switch block.");
        System.out.println(today);
        boolean weekday = false;
        boolean isWeekend = false;

        switch (dayNumber) {
            case 7:
            case 6:
                isWeekend = true;
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                weekday = true;
        }
        String weekText = "";
        if (isWeekend) {
            weekText = " is weekend.";
        } else {
            weekText = " is not weekend.";
        }

        System.out.println(today + weekText);


    }
}