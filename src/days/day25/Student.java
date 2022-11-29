package days.day25;

public class Student {
    public static void main(String[] args) {
        // name(110);will return a name Ronaldo
        // 110 120 130 140 150 160
        name(150);
        name2(150);
        // grade(80);
        //  result(studentNumber,examPoint)
        result(120, 80);//  ======> Ronaldo's grade is B
        result(110, 70);
        String resultOfThe150 = result(150, 90);
        System.out.println("resultOfThe150 = " + resultOfThe150);

    }

    public static String result(int studentNumber, int examPoint) {
//        String name = name(studentNumber);
//        char grade = grade(examPoint);
        // Ronaldo's grade is B
       // String text = name + "'s grade is " + grade;
        String text =name(studentNumber) + "'s grade is " + grade(examPoint);
//        System.out.println("text = " + text);
        return text;
    }

    static char grade(int point) {
        char grade = 'A';
        if (point >= 80 && point <= 100) {
            //grade = 'A';
        } else if (point < 80 && point > 60) {
            grade = 'B';
        } else if (point < 60 && point > 30) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }


    public static String name(int studentNumber) {
        switch (studentNumber) {
            case 110:
                return "Ronaldo";
            case 120:
                return "Messi";
            case 130:
                return "Veli";
            case 140:
                return "Ayse";
            case 150:
                return "Fatma";
            case 160:
                return "Curry";
            default:
                return "name couldnt be found";
        }
    }

    public static String name2(int studentNumber) {
        String name = "";
        switch (studentNumber) {
            case 110:
                name = "Ronaldo";
                break;
            case 120:
                name = "Messi";
                break;
            case 130:
                name = "Veli";
                break;
            case 140:
                name = "Ayse";
                break;
            case 150:
                name = "Fatma";
                break;
            case 160:
                name = "Curry";
            default:
                name = "name couldnt be found";
        }
        System.out.println("name = " + name);
        return name;
    }


}
