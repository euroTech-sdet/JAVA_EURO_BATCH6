package days.day44;

public class ThisSample {

    int idNumber;

    public ThisSample(int idNumber) {  // parametrize constructor
        this.idNumber = idNumber;
        System.out.println("Parametrize constructor!!");
    }

    public ThisSample() {  // default constructor!!
        System.out.println("Default constructor!!" );
    }
}

class ThisTest{

    public static void main(String[] args) {

        ThisSample obj1 = new ThisSample();
        System.out.println("obj1.idNumber = " + obj1.idNumber);   //0

        ThisSample obj2 = new ThisSample(100);
        System.out.println("obj2.idNumber = " + obj2.idNumber);  // 100

    }
}
