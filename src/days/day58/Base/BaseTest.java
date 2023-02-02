package days.day58.Base;

import days.day58.Base.Calculate;

public class BaseTest {
    public static void main(String[] args) {
//        BaseMethods baseMethods = new BaseMethods(); not possible to create object from basemethods class
//                it is an abstract class
        Calculate calculate = new Calculate();
        calculate.add();
        calculate.calculate();


    }
}
