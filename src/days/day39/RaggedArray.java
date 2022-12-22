package days.day39;

import java.util.Arrays;
import java.util.Scanner;

public class RaggedArray {

    public static void main(String[] args) {

        int[][] triangleArray= new int[4][];

        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray)); // --> will return null

        triangleArray[0] = new int[4];
        triangleArray[1] = new int[13];
        triangleArray[2] = new int[2];
        triangleArray[3] = new int[15];

        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray));

        triangleArray[0][2]= 7;

        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray));

//        triangleArray[2][2]= 6;  // --> ArrayIndexOutOfBoundsException
//
//        int [] test = {0,1,2};
//        test[3] = 4;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i< triangleArray.length  ; i++){   //-> ROWs
//
//            for(int j=0; j<triangleArray[i].length ; j++){  // -> Columns!!
//                System.out.println("enter table "+ i+ "  row, "+ j +" column  value: ");
//                triangleArray[i][j] = scanner.nextInt();
//            }
//        }


        int [][] test = new int[3][4];

        System.out.println("Arrays.deepToString(test) = " + Arrays.deepToString(test));

        int [] x= {11,22};

        test[0]= x;

        System.out.println("Arrays.deepToString(test) = " + Arrays.deepToString(test));

        System.out.println("test[0][3] = " + test[0][3]);  // ArrayIndexOutOfBoundsException

        int[] xx= {1,2,3};
//            xx[10];  --> ArrayIndexOutOfBoundsException
        int [] yy = {33,44};

        xx= yy;
        System.out.println("Arrays.toString(xx) = " + Arrays.toString(xx));


    }
}
