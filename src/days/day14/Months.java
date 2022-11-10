package days.day14;

public class Months {
    public static void main(String[] args) {
        int monthNumber = 6;
        String month = "";
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "invalid month";
        }
        System.out.println("month = " + month);

        String season = "";

        switch (month) {// june
            case "January":
            case "February":
            case "December":
                season = "Winter";
                break;
            case "March":
            case "April":
            case "May":
                season = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                season="Summer";
                break;
            case "September":
            case "October":
            case "November":
                season="Autumn";
                break;
            default:
                season="invalid month";
        }

        System.out.println(season);//


    }
}
