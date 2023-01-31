package days.day57;

public class Karabank extends Bank{

    public Karabank(String accountType, double currentBalance ) {
        super(accountType.toUpperCase(),currentBalance + 100, "KaraBank" );

        switch (super.getAccountType()) {
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpense(90);
                setReturnRate(1.4);
                break;
            case "SAVING":
                setDepositBonus(100);
                setWithdrawExpense(70);
                setReturnRate(1.1);
                break;
            case "INTEREST":
                setDepositBonus(90);
                setWithdrawExpense(80);
                setReturnRate(1.2);
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");
                // TODO group study task: try to handle this future more dynamic
        }
    }


    @Override
    public void deposit(double depositValue) {
        if(depositValue<3000){
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }


    @Override
    public void withdraw(double withDrawValue) {
        if (withDrawValue < 2000) {
            super.withdraw(withDrawValue);
        } else {
            super.withdraw(withDrawValue + getWithdrawExpense());
        }
    }
}
