package days.day30;

public class PassReference {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
        System.out.println("number = " + number);
        Student messi = new Student();
        messi.number = 10;

        PassReference passReference = new PassReference();

        String str = new String("Faruk");
        passReference.printText(str);

        Student ronaldo = new Student();
        ronaldo.number = 20;
        passReference.printNumber(messi);
        System.out.println("messi.number = " + messi.number);//50

        passReference.printNumber(ronaldo);
        System.out.println("ronaldo.number = " + ronaldo.number);
    }

    public void printNumber(Student student) {
        System.out.println("student.number = " + student.number);//10
        student.number = 50;
    }

    public void printText(String str) {
        System.out.println("str = " + str);
    }


    public static void printNumber(int n) {
        System.out.println("n = " + n);
        n = 500;
        System.out.println("n = " + n);
    }


}
