package days.day7;

public class CastingSamples {

    public static void main(String[] args) {

        long numLong= 411131112111111L;

//        int numInt= numLong;//ERROR-> long > int

        int numInt= (int) numLong; // exp casting

        System.out.println("numInt = " + numInt); // -337331193


        ////////////////////////////

        numLong = 123456;  //    long <- int   == IMP CASTING

        numInt = (int)numLong;  //  int <- Long

        System.out.println("numInt = " + numInt);


        ////////////////////////////


    }
}
