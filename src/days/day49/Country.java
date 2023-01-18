package days.day49;

public class Country {

//DATA FIELDS
   String name;
   int dummyCounter;
   static int countryCounter;


    public Country(String name) {
        this.name = name;
        dummyCounter = 1;
        countryCounter ++;
    }

    public static void main(String[] args) {

        Country c1 = new Country("Germany");
        System.out.println("c1.name = " + c1.name);
        System.out.println("c1.dummyCounter = " + c1.dummyCounter);  //1
        System.out.println("Country.countryCounter = " + Country.countryCounter); //1
        c1.dummyCounter=100;
        System.out.println("c1.dummyCounter = " + c1.dummyCounter);  //100

        Country c2 = new Country("France");
        System.out.println("Country.countryCounter = " + Country.countryCounter); //2
        System.out.println("c2.dummyCounter = " + c2.dummyCounter);  //1

        Country c3 = new Country("Turkey");
        System.out.println("Country.countryCounter = " + Country.countryCounter); //3
        System.out.println("c3.dummyCounter = " + c3.dummyCounter);  //1

        System.out.println("c1.countryCounter = " + c1.countryCounter); //3
    }
}
