package days.day17;

public class DivideBy {
    public static void main(String[] args) {

        // 10-30
        // 10%2
        //10%3
        //10%5

        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int count235 = 0;
        int sum2 = 0;

        for (int i = 10; i <= 30; i++) {
            System.out.println("i = " + i);
            if (i % 2 == 0) {
                sum2 = sum2 + i;
                System.out.println(i + " dividable by 2");// 10 12
                count2++;
            }
            if (i % 3 == 0) {
                System.out.println(i + " dividable by 3");//
                count3++;
            }
            if (i % 5 == 0) {
                ++count5;
                System.out.println(i + " dividable by 5");
            }
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " dividable by 2&3&5");
                ++count235;
            }
        }
        System.out.println("count2 = " + count2);
        System.out.println("count3 = " + count3);
        System.out.println("count5 = " + count5);
        System.out.println("count235 = " + count235);
        System.out.println("sum2 = " + sum2);
        int average2 = sum2 / count2;
        System.out.println("average2 = " + average2);

        int sumx = 0;
        int averagex = 0;
        int countx = 0;
        for (int x = 7; x < 123; x++) {
            sumx = sumx + x;
            countx++;
        }
        System.out.println("countx = " + countx);
        System.out.println("sumx = " + sumx);
        averagex = sumx / countx;
        System.out.println("averagex = " + averagex);
    }
}
