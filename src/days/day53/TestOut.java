package days.day53;

import days.day54.AccessModifier;


public class TestOut {

    public static void main(String[] args) {
        AccessModifier obj1= new AccessModifier();

        obj1.value=1;
     //  obj1.pageElement="ssss"; //no access -> default!!

//        Test2 objTest2= new Test2();  // no access -> default class!!
//        Test2.key=1;  // no access -> default class!!

//        obj1.isActive= false; // no access -> protected, no inh relationship!!
    }
}
