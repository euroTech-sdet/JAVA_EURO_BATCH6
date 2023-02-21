package days.day70;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FinalReview {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        try {
            int i = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Wrong input!!!");
        }


        StringBuffer str= new StringBuffer();


        int [] arrayInt1= {1,2,3};
        List<Integer> list = Arrays.stream(arrayInt1).boxed().collect(Collectors.toList());
//        float [] arrayfloat = {1.1f,1.2f};
//        List<Integer> list2 = Arrays.stream(arrayfloat).boxed().collect(Collectors.toList());


        /////////////////////////////////////////////




    }
}
