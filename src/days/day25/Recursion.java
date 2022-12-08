package days.day25;

public class Recursion {
    public static void main(String[] args) {

        print(5);
    }

    public static void print(int n) {//5 4 3 2 1
        if(n>0){
            print(n-1);// 4 3 2 1 0
        }
        System.out.println("n = " + n);//0 1
    }

    // fibonacci numbers
    // sum of the numbers between
}
