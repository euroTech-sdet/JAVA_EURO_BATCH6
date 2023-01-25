package days.day51;

public class CakeTest {
    public static void main(String[] args) {
        Cake ronaldoCake = new Cake();
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);//10
        Cake messiCake = new Cake();
        System.out.println("messiCake.slices = " + messiCake.slices);//10
        ronaldoCake.eatCakeSlices();//ronaldo ate 1 slice of cake  9  familycake 9
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);//9
        ronaldoCake.eatCakeSlices();//ronaldo ate 1 slice of cake  8   familycake 8
        System.out.println("messiCake.slices = " + messiCake.slices);//10
        messiCake.eatCakeSlices();// 9 slice ,  familycake 7
        System.out.println("Cake.familyCake = " + Cake.familyCake);
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);
        System.out.println("messiCake.slices = " + messiCake.slices);
        // ronaldo slices
        // messi slices
        // family slices
    }
}
