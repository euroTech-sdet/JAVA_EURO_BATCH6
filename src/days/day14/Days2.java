package days.day14;

public class Days2 {
    public static void main(String[] args) {

        String today = "";
        int dayNumber = 6;
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
        System.out.println("today  coming from switch= " + today);

        if (dayNumber == 1) {
            today = "Monday";
        } else if (dayNumber == 2) {
            today = "Tuesday";
        } else if (dayNumber == 3) {
            today = "Wednesday";
        } else if (dayNumber == 4) {
            today = "Thursday";
        } else if (dayNumber == 5) {
            today = "Friday";
        } else if (dayNumber == 6) {
            today = "saturday";
        } else if (dayNumber == 7) {
            today = "Sunday";
        } else {
            today = "nothing";
        }
        System.out.println("today coming from if statements = " + today);
        // weekdays 1 2 3 4 5
        boolean isWeekend = false;
        dayNumber = 7;
        if (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 || dayNumber == 4 || dayNumber == 5) {
            isWeekend = false;
        } else if (dayNumber == 6 || dayNumber == 7) {
            isWeekend = true;
        } else {
            System.out.println("wrong number for the month");
        }
        System.out.println("isWeekend from if statements = " + isWeekend);
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                isWeekend = false;
                break;
            case 6:
            case 7:
                isWeekend = true;
                break;
            default:
                System.out.println("hello from switch case");
        }

        System.out.println("isWeekend  coming from switch = " + isWeekend);

    }
}
