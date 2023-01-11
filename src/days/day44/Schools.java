package days.day44;

public class Schools {

    String schoolName;
    String headTeacher;
    int studentNumber;
   static int schoolId=1000;
    int teacherNumber;
    boolean isSchoolActive;

    public Schools(String sn, String headTeacher, int studentNumber, int teacherNumber) {
        this();
        //        schoolId++;
//        BankSample.AAregistration();
        schoolName = sn;
        this.headTeacher = headTeacher;
        this.studentNumber = studentNumber;
        this.teacherNumber = teacherNumber;
        this.isSchoolActive = true;
    }

    public Schools() {
        schoolId++;
        BankSample.AAregistration();
    }

    public Schools(String schoolName) {
        this();
//        schoolId++;
//        BankSample.AAregistration();
        this.schoolName = schoolName;

    }
//    public Schools(String headTeacher) {
//        schoolId++;
//        this.headTeacher = headTeacher;
//    }
}

class LocalSchool{
    public static void main(String[] args) {
        Schools school1 = new Schools("Alice Primary School","Adam Smith",130,10);
        System.out.println("school1.schoolId = " + school1.schoolId); //1001
        System.out.println("school1.headTeacher = " + school1.headTeacher);

        Schools school2 = new Schools("Beta Primary School","Jenny Smith",111,11);
        System.out.println("school2.schoolId = " + school2.schoolId); //1002
        Schools school3 = new Schools("Gama Primary School","Henry Smith",121,13);
        System.out.println("school3.schoolId = " + school3.schoolId); //1003

        Schools school4 = new Schools();
        System.out.println("school4.schoolId = " + school4.schoolId); // dont call with object, it is belongs to the class !!!

        Schools school5 = new Schools("Walkers High School");
        System.out.println("School.schoolId = " + Schools.schoolId);
    }


}
