package days.day57;

public class Bank {


    private String bankName;

    private double currentBalance;   // to keep current balance value for created account
    private double finalBalance;     // to keep final balance after account closed -> current balance * (1+return Rate)

    private String accountType;   // GOLD   SAVING INTEREST

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private boolean isAccountClosed = true;

    //////////////////// CONST \\\\\\\\\\\\\\\\\\\\\\\\

    public Bank(String accountType, double currentBalance, String bankName) {
        this.currentBalance = currentBalance;
        this.accountType = accountType;
        System.out.println("\n============ Welcome to " + bankName + " !!! =============");
        System.out.println("Your " + accountType + " account's current balance is " + currentBalance);
        this.bankName = bankName;
        isAccountClosed = false;

        // TODO try to initialize bonus,expense and rate in 1 place...

    }

    /////////////////// METHODS - Functions \\\\\\\\\\\\\\\\\\\\\\\

    public void deposit(double depositValue) {
        if (depositValue < 0) {
            System.out.println("INVALID DEPOSIT VALUE");
            // TODO u can try to ask a value again..
        } else {
            currentBalance += depositValue;
            System.out.println("You were deposit " + depositValue + " to your " + getAccountType() + " account!!");
            System.out.println("Your Current Balance is : " + getCurrentBalance());
        }
    }

    public void withdraw(double withDrawValue) {
        if (withDrawValue < 0) {
            System.out.println("INVALID DEPOSIT VALUE");
            // TODO u can try to ask a value again..
        } else if(withDrawValue > getCurrentBalance()){ // TODO handle expense amount in here as well!!
            System.out.println("You tried to withdraw " + withDrawValue + " value, Insufficient fund!!!");
            // TODO u can try to ask a value again..
        }else {
            currentBalance -= withDrawValue;
            System.out.println("You were withdraw " + withDrawValue + " to your " + getAccountType() + " account!!");
            System.out.println("Your Current Balance is : " + getCurrentBalance());
        }
    }

    public double closeAccount() {

        if(isAccountClosed()){
            System.out.println("!!!!!!! Account is already closed !!!!!!!!!");
        } else {
            System.out.println(" \t\t******** ACCOUNT CLOSE PROCESS START  **********");
            finalBalance = getCurrentBalance() * getReturnRate();
            currentBalance = 0;
            System.out.println(" !!!!! YOUR FINAL BALANCE : " + getFinalBalance());
            System.out.println("\t\t!!!!!!!!  YOUR ACCOUNT CLOSED    !!!!!!!!");
            isAccountClosed= true;
            accountType = "CLOSED!!!";
            // TODO you can add extra scenarios for closing / reopening accounts!!
        }

        return getFinalBalance();

    }


    /////////////////// GETTERS \\\\\\\\\\\\\\\\\\\\\\\

    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawExpense() {
        return withdrawExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public boolean isAccountClosed() {
        return isAccountClosed;
    }


    /////////////////// SETTERS \\\\\\\\\\\\\\\\\\\\\\\

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }
}
