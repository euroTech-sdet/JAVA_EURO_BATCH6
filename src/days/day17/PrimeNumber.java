package days.day17;

public class PrimeNumber {
    public static void main(String[] args) {
        // 20 is prime or not
        int number = 17;
        // 2 3 4 5 6 7 8  9%2==0
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
//                System.out.println("this number is not prime");
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
        String result = (isPrime) ? number + " is prime" : number + "is not prime";
        System.out.println( result);
        // fibonacci numbers
    }
}
