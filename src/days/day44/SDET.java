package days.day44;

public class SDET {

//    Create a class template for given name: SDET
//    Add properties to class:
//    name, age, gender(M/F), company, salary, isSuccessful=True
//    Add functions to class:
//    increaseSalary(raiseAmount) , companyChange(newCompany)

    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccessful;

    public SDET(String name, int age, char gender, String company, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccessful = true;
    }

    public void increaseSalary(double raiseAmount){
        salary += raiseAmount;
    }

    public void companyChange(String newCompany){
        this.company = newCompany;
    }

}

class SdetTest{

    public static void main(String[] args) {

        SDET sdet1 = new SDET("NazliP",18, 'F',"Amazon", 100000 );

        System.out.println("sdet1.salary = " + sdet1.salary);
        sdet1.increaseSalary(25000);
        System.out.println("sdet1.salary after new year = " + sdet1.salary);

        SDET sdet2 = new SDET("SeyitBey",18, 'M',"BMW", 100001 );
        sdet2.companyChange("Facebook");
        System.out.println("sdet2.company = " + sdet2.company);
    }


}
