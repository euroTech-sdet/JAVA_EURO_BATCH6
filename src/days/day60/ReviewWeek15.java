package days.day60;

public abstract class ReviewWeek15 {

    int value= 2;
    public abstract void test();

    public void test2(){
        System.out.println("review!!!");
    }
}


class TestReview{
    public static void main(String[] args) {

            ReviewWeek15 obj = new ReviewWeek15() {  // anonymous class
                @Override
                public void test() {

                }
        };

        System.out.println("obj.value = " + obj.value);


    }
}
