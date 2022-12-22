package days.day39;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrays {


    public static void main(String[] args) {


        int[][] matrix = new int[5][5];

        int[] oneD = new int[5];
        int[] oneD2 = {1};

        TwoDarrays tt = new TwoDarrays();

        System.out.println("tt = " + tt);

        System.out.println("oneD = " + oneD);

        System.out.println("Arrays.toString(matrix) = " + Arrays.toString(matrix));

        // USE deepToString() to print multi dimensional Arrays
        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));


        matrix[2][1] = 7;  // [row-> array number] [column-> which element of related array!!]

        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));


//        int [][] table = new int[3][3];
//        table[0][0]=1 ;
//        table[0][1]=2;
//        table[0][2]=3 ;
//        table[1][0]=4 ;
//        table[1][1]=5 ;
//        table[1][2]=6 ;
//        table[2][0]=7 ;
//        table[2][1]=8 ;
//        table[2][2]=9 ;
        int[][] table2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        Arrays.toString(table2[1]); // --> {4,5,6}
        System.out.println("table[2][1] = " + table2[2][1]); // --> 8

        System.out.println("Arrays.deepToString(table) = " + Arrays.deepToString(table2));


        //
        int[][] test = new int[3][];  // only we have to provide row number --> array number inside outer array!!
        int[][] test2 = new int[3][5];
        System.out.println("test2.length = " + test2.length); // will give us row (array) number!!
        System.out.println("test2[1].length = " + test2[1].length); // will give us column number for given row(array)!
        System.out.println("test2[0].length = " + test2[0].length); // will give us column number for given row(array)!


//        table[0][0]=1 ;
//        table[0][1]=2;
//        table[0][2]=3 ;
//        table[1][0]=4 ;
//        table[1][1]=5 ;
//        table[1][2]=6 ;
//        table[2][0]=7 ;
//        table[2][1]=8 ;
//        table[2][2]=9 ;

//         00
//         01
//         02
//         10
//         11
//         12
//         20
//         21
//         22

        System.out.println("\n//////////////////////// MANUAL DATA ENTRY WITH NESTED LOOP ///////////////////////// \n");
        Scanner scanner = new Scanner(System.in);
        int [][] table = new int[3][3];

        for(int i=0; i< table.length  ; i++){   //-> ROWs

            for(int j=0; j<table[i].length ; j++){  // -> Columns!!
                System.out.println("enter table "+ i+ "  row, "+ j +" column  value: ");
                table[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Arrays.deepToString(table) = " + Arrays.deepToString(table));


    }
}
