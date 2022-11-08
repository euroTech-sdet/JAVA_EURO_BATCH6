package days.day13;

public class NestedIf {


    public static void main(String[] args) {


        int number = 11;


        if (number < 20) { // OUTER IF !!  T

            System.out.println("Number is less than 20");

            if (number > 15) {   // INNER IF!! F
                System.out.println("Number is bigger than 15");
            }
        }

        //////////////

        if (number < 20 && number > 15) {  //11
            System.out.println("Number is less than 20");
            System.out.println("Number is bigger than 15");
        }  // it will not print anything !!!


        /////////////////////////

        // Mike has 2 key, 1 for garden 1 for home. Without entering garden we can not access the home!!
        // TODO LIST for mike
        // if mike can enter garden he can do clean garden !!
        // if mike can enter home as well , he can watch the TV!!
        // if mike can not enter Garden and home , need to go Library

        boolean gardenKeyExist = true;
        boolean homeKeyExist = true;
//        -->  expected result : clean garden , watch TV

//         gardenKeyExist= true;
//        homeKeyExist= false;
//        -->  expected result : clean garden

        gardenKeyExist = false;
        homeKeyExist = true;
        //-> expected result: go library!!

        if (gardenKeyExist) { // OUTER

            if (homeKeyExist) { //inner!!
                System.out.println("Watch TV");
            }

            System.out.println("Clean Garden");

        } else {   // ! GARDEN & HOME
            System.out.println(" GO to the Library!!");
        }


//        if (gardenKey) { //O1
//            System.out.println("Clean the garden");
//            if (homeKey) { //O2 -inner1
//                System.out.println("Watch TV");
//                if (gardenKey == false) { // not accessible !! always return FALSE!!! type it else section of OUTER IF!!
//                    System.out.println("Go to the library");
//                }
//
//            }
//        }
//    }}


    }
}
