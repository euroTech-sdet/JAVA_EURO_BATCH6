package days.day46;

public class AccountTest {
    public static void main(String[] args) {
        Account accountHolder1 = new Account("Ronaldo", 150.60);
        //  System.out.println("accountHolder1.name = " + accountHolder1.name);
        //   System.out.println("accountHolder1.balance = " + accountHolder1.balance);
        //   accountHolder1.name = "Bahadir";
        //  accountHolder1.name = "Messi";
        System.out.println("accountHolder1.getName() = " + accountHolder1.getName());
        System.out.println("accountHolder1.getBalance() = " + accountHolder1.getBalance());
        double ronaldoBalance = accountHolder1.getBalance();
        System.out.println("ronaldoBalance = " + ronaldoBalance);

        Account accountHolder2 = new Account("Messi", 75.55);
        System.out.println("accountHolder2.getName() = " + accountHolder2.getName());
        double messiBalance = accountHolder2.getBalance();
        System.out.println("messiBalance = " + messiBalance);
        print("Ali");
    }

    public static void print(String name) {
        System.out.println("Hello");
    }
}
