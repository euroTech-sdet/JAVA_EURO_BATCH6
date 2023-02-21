package days.day70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizReview {

    int test;

    public int value;

    private int pValue;


    public void test(){
        System.out.println("test = " + test);
        System.out.println("value = " + value);
        System.out.println("pValue = " + pValue);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);

        list.clear();

        System.out.println("list.size() = " + list.size());


        ///////////////////

        String str1="dsa";
        String str2="dsasdsd";
        str1.concat(str2);

        int[]arrayInt= {1,2,3};


        //////////////////////////////

        List<List<String>> listOfDriver= new ArrayList<>();

        List<String> driver1= new ArrayList<>();
        driver1.add("YT123456YT");
        driver1.add("NE6 TMC");
        driver1.add("80");
        
        listOfDriver.add(driver1);
//        listOfDriver.add(driver2);
//        listOfDriver.add(driver3);




    }
}


class TestReview{

    static int count;
    int value;
    public void test2(){
       QuizReview obj = new QuizReview();

        System.out.println("obj.value = " + obj.value);
//        System.out.println("obj.pValue = " + obj.pValue);
    }

    public static void  st1(){
//        test2();
        st2();
        count=2;
//        value=2;
    }

    public static void  st2(){}

    public static void  st2(int a){}
}