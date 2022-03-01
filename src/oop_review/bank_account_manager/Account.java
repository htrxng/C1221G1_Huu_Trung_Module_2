package oop_review.bank_account_manager;

public class Account {
    public final float interest = 0.035f;
    public final float transactionFee = 1f;
    private long accountNumber;
    private String nameOfOwner;
    private double surplus;
    public Account() {
    }

    public Account(long accountNumber, String nameOfOwner) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.surplus = 50;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public double getSurplus() {
        return surplus;
    }

    public void depositMoney(double amountOfMoneyDeposit) {
        if (amountOfMoneyDeposit > 0) {
            this.surplus += amountOfMoneyDeposit;
            System.out.println("Deposit money successfully");
        } else {
            System.out.println("amount of money must be greater than 0$ ");
        }
    }

    public void withdrawMoney(double amountOfMoneyWithdraw) {
        if ((amountOfMoneyWithdraw + transactionFee) < this.surplus) {
            this.surplus -= (amountOfMoneyWithdraw + transactionFee);
            System.out.println("Withdraw money successfully!");
        } else {
            System.out.println("surplus not enough.");
        }
    }

    public void expire() {
        this.surplus = this.surplus + this.surplus * interest;
    }

    public void transfers(double amountOfMoneyTransfers, Account account, String message) {
        if ((amountOfMoneyTransfers + transactionFee) < this.surplus) {
            this.surplus -= (amountOfMoneyTransfers + transactionFee);
            account.surplus += amountOfMoneyTransfers;
            System.out.println("transfer successfully with message to " +account.nameOfOwner+ " : "+ '"' + message+ '"' );
        } else {
            System.out.println("surplus not enough.");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", surplus=" + surplus + "$" +
                '}';
    }
}
