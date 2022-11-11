package days.day16;

public class Triangle {
    public static void main(String[] args) {
        int a = 15;
        int b = 13;
        int c = 1;
        //   13+1>15       15-1<13
        //        a - b < c < a + b;
        //        b-c<  a   < b+c
        //         c-a < b <   c+a

//        boolean isValidTriangle = (c < a + b) ? (a < b + c) ? (b < a + c) : false : false;
        boolean isValidTriangle = ((c < a + b) && (a < b + c) && (b < a + c)) ? true : false;
        System.out.println("isValidTriangle = " + isValidTriangle);


    }
}
