package days.day41;

public class WrapperTasks {

    public static void main(String[] args) {
        int[] intARray = {11, 2, 4, 11, 5, 0};
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        String str3 = "A1B2£3";
        task1(intARray);
        task2(intARray);
        task3_decryption(str1);
        task4(str3);
    }

    public static void task1(int[] n) {
        //Write a method that can find the minimum number from an int Array
        Integer min = Integer.MAX_VALUE;
        for (Integer i : n) {
//            if(i<min){
//                min= i;
//            }
            min = Math.min(i, min);
        }
        System.out.println("Min value is = " + min);
    }

    public static void task2(int[] n) {
//        Write a method that can find the maximum number from an int Array
        Integer min = Integer.MIN_VALUE;
        for (Integer i : n) {
//            if(i>min){
//                min= i;
//            }
            min = Math.max(i, min);
        }
        System.out.println("Max value is = " + min);

    }

    public static void task3_decryption(String str) {
//        Write a method that can recognise numbers in following Strings and print them as digits
        String code = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                code += str.charAt(i);
                // or directly print System.out.print(str.charAt(i));
            }
//
//         if(str.charAt(i)<='9'&& str.charAt(i)>='0' ){
//
//         }
        }
        System.out.println("\nCode = " + code);

        ////////////

//        for (String s : str.split("")) {
//
//        }
    }

    public static void task4(String str) {
// Write a method that can return the sum of the digits in a string
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                sum += Integer.parseInt(String.valueOf(str.charAt(i)));  // ==  parseInt("" + str.charAt(i) )
                //    sum += Integer.valueOf(str.charAt(i));  // this is wrong!! return decimal value of char!!
                //    sum += Integer.valueOf(str.substring(i,i+1));  // this is ok!
            }
        }
        System.out.println("Sum = " + sum);
    }
}
