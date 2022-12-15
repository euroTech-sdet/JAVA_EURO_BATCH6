package days.day35;

public class MethodsEquals {
    public static void main(String[] args) {
        String city = "Oslo";// string pool
        String city2 = new String("Oslo");// in the heap
        String city3 = "Oslo";
        System.out.println(city.equals(city2));// true will check yhe value
        System.out.println(city == city2);//false will check the adress in the heap
        System.out.println(city == city3);//true
    }
}
