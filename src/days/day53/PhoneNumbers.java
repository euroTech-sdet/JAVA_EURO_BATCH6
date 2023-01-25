package days.day53;

public class PhoneNumbers {
    public static void main(String[] args) {
//        Phone Number Reformat
//                * We are given a string S representing a phone number, which we would like to reformat.
//                String S consists of N characters: digits, spaces and/or dashes.
//                It contains at least two digits. Spaces and dashes in string S can be ignored.
//                * We want to reformat the given phone number in such a way that the digits are grouped in blocks of length three, separated by single dashes.
//                If necessary, the final block or the last two       blocks can be of length two.
//                Example: 1
//
//        Input:
//
//        00-44 48 5555 8361
//
//        Output
//
//        004-448-555-583-61

        String number = "00-44 48 5555 83 7";
        //               004-448-555-583-61
        //   111-222-333-444-555-66
        number = number.replace("-", "");
        number = number.replace(" ", "");
        System.out.println("number = " + number);
        String afterFormat = "";
        number.substring(0, 3);

        for (int i = 0; i < number.length() - 2; i = i + 3) {
            afterFormat = afterFormat + number.substring(i, i + 3) + "-";
        }
        int lastNumbers = number.length() % 3;
        String lastLetters = number.substring(number.length() - lastNumbers);
        System.out.println(afterFormat);
        afterFormat = afterFormat + lastLetters;
        System.out.println("afterFormat = " + afterFormat);
        if (lastNumbers == 0) {
            afterFormat = afterFormat.substring(0, afterFormat.length() - 1);
        }
        System.out.println("afterFormat = " + afterFormat);

    }
}
