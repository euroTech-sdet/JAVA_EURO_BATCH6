package days.day40;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        // char grades [][]=new char[][];

        char[][] grades = {
                {'A','B','A','C','C','D','E'},
                {'D','B','A','B','C','A','E','E','A'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};
        char[] key = {'D', 'B', 'D', 'C','C','D','A','E','A','D'};
        int count = 0;
        for (int i = 0; i < grades.length; i++) {  // to check each student
            count = 0;
            for (int j = 0; j < grades[i].length; j++) {  // to check all questions one by one
                if (grades[i][j] == key[j]) {
                    count++;
                }
            }
            System.out.println("Student " + i + " 's correct count is " + count);
        }

        //////////////


        int [][] test = {};

        System.out.println(Arrays.deepToString(test));


    }
}
