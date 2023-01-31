package days.day57;

public class TestBank {

    public static void main(String[] args) {

        Akbank golden1 = new Akbank("gold",5000);

//        System.out.println("golden1.getDepositBonus() = " + golden1.getDepositBonus());

        golden1.deposit(3000);   ///  3000 + 5000 + 80 + 120= 8200
        golden1.deposit(1000);   ///  8200 + 1000 = 9200

        golden1.withdraw(200);  ///  9200 - 200 = 9000
        golden1.withdraw(2000); ///  9000 - 2070 = 6930

        golden1.withdraw(7000);

        System.out.println("golden1.getCurrentBalance() = " + golden1.getCurrentBalance());

        double returnFinalMoney = golden1.closeAccount();

      //  double returnFinalMoney = golden1.closeAccount();

        System.out.println("golden1.getCurrentBalance() = " + golden1.getCurrentBalance()); ///--> should return 0!!
        System.out.println("golden1.getAccountType() = " + golden1.getAccountType()); ///--> should return CLOSED!!!!!

//        golden1 =new Akbank("SAVING", returnFinalMoney);
           Karabank interest1= new Karabank("Interest", returnFinalMoney);

    }
}
