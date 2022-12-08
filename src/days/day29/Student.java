package days.day29;

public class Student {
    String name;// instance variables , fields, properties ,attributes
    int number;
    String city;
    int mathExamResult;   // 100 50 90 ---> 80    80 90 100 ---->90
    int scienceExamResult;
    int literatureExamResult;
    // print exam results with name
    // in diffirent method print the average of the result of the person

    public void printNumber() {
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        String name;
        //  System.out.println("name = " + name);
        Student student1 = new Student();
        student1.name = "Ronaldo";
        Student student2 = new Student();
        student2.name = "Messi";
        System.out.println("student1.name = " + student1.name);
        student1.number = 101;
        student2.number = 102;
        System.out.println("student2.number = " + student2.number);
        System.out.println("student1.number = " + student1.number);
        new Student();// by using new keyword and then clas name with ()we create an object
        Student student3;
        student3 = student1;
        System.out.println("student3.name = " + student3.name);
        System.out.println("student3.number = " + student3.number);
        student1.city = "London";
        System.out.println("student1.city = " + student1.city);
        System.out.println("student2.city = " + student2.city);
        System.out.println("student1.mathExamResult = " + student1.mathExamResult);
        student3 = new Student();
        System.out.println("student3.name = " + student3.name);
        student1.printStudentInfo();
        student2.printStudentInfo();
        int a;
        a = 10;
        Student student4=new Student();
        student2.printNumber();

    }

    public void printStudentInfo() {// instance method
        System.out.println("name = " + name);
    }


}
