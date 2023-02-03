package days.day60.BankProjectUpdate;

public class Akbank extends Bank {

//    final private static double welcomeBonus= 120;

    public Akbank(String accountType, double currentBalance) {
        super(accountType.toUpperCase(), currentBalance, "Akbank", 120);

        switch (super.getAccountType()) {
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpense(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawExpense(60);
                setReturnRate(1.2);
                break;
            case "INTEREST":
                setDepositBonus(100);
                setWithdrawExpense(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");
                // TODO group study task: try to handle this future more dynamic
        }


    }


    @Override
    public void deposit(double depositValue) {
        if (depositValue < 2000) {
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }

    @Override
    public void withdraw(double withDrawValue) {
        if (withDrawValue < 1000) {
            super.withdraw(withDrawValue);
        } else {
            super.withdraw(withDrawValue + getWithdrawExpense());
        }
    }
}
