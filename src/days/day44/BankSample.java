package days.day44;


import java.text.SimpleDateFormat;
import java.util.Date;

public class BankSample {


    String accountName;

    int accountNumber;

    String currency;

    double bbRate;

    String openDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

    double balance;

    int accountCounter;

    public void deposit(){

    }

    public void withdraw(){

    }

    public static void AAregistration(){

    }
}


class TestBankSample{

    public static void main(String[] args) {

        BankSample account1 = new BankSample();

        System.out.println("account1.accountNumber = " + account1.accountNumber);

        account1.accountName= "Euro Account";
        account1.balance = 111_222;
        account1.accountNumber= 10_001;
        account1.bbRate= 0.01;
        account1.currency= "€";
        account1.openDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        System.out.println("account1.openDate = " + account1.openDate);

        System.out.println("account1.balance = " + account1.balance);

        System.out.println("account1.accountNumber = " + account1.accountNumber);

        System.out.println("////////////////////////////////////////////////////////////////");

        BankSample account2 = new BankSample();

        account2.accountName= "USD Account";
        account2.balance = 22222;
        account2.accountNumber= 10002;
        account2.bbRate= 0.05;
        account2.currency= "$";
        account2.openDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        System.out.println("////////////////////////////////////////////////////////////////");

        BankSample account3 = new BankSample();

        account3.accountName= "GBP Account";
        account3.balance = 33222;
        account3.accountNumber= 10003;
        account3.bbRate= 0.05;
        account3.currency= "£";
        account3.openDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());




    }


}
