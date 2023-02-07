package days.day60;

public class Addition {

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(10, 20);
        addition.add(10, 20, 30);
        addition.add(10,20,50);


    }

    //    add(int a,int b)
    public int add(int a, int b) {
        System.out.println(a + b);
        int c = a + b;
//        return a + b;
        return c;
    }

    public int add(int a, int b, int c) {
       // add(5, 6);
        System.out.println(a + b + c);
        return a + b + c;
    }


}
