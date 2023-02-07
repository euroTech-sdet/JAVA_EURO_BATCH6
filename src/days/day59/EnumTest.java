package days.day59;

public class EnumTest {
    //    Use enums when you have values that you know aren't going to change,
//    like month days, days, colors, deck of cards, etc.
    public static void main(String[] args) {
        System.out.println("Days.MONDAY = " + Days.MONDAY);
        System.out.println("Days.SUNDAY = " + Days.SUNDAY);
        Days day = Days.WEDNESDAY;
        boolean isWeekend = true;

        switch (day) {
            case FRIDAY:
            case MONDAY:
            case WEDNESDAY:
            case TUESDAY:
            case THURSDAY:
                isWeekend = false;
                System.out.println("it is not weekend");
                break;
            case SATURDAY:
            case SUNDAY:
                isWeekend = true;
                System.out.println("happy weekend");
        }
        System.out.println("isWeekend = " + isWeekend);

        Days.values();
        for (Days d : Days.values()) {
            System.out.println("d = " + d);
        }
        String newcastle = Clubs.NEWCASTLE.toString();
        System.out.println("newcastle = " + newcastle);
        System.out.println("Days.MONDAY.number = " + Days.MONDAY.number);
        //Days.SUNDAY.number = 10;


    }
}
