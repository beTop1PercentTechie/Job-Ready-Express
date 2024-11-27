package helper;

public class TransactionValidator {

    public boolean validateDeposit(double amount) {
        return amount > 0;
    }

    public boolean validateWithdrawal(double amount, double balance) {
        return amount > 0 && amount <= balance;
    }

    public boolean validateTransfer(double amount, double balance) {
        return validateWithdrawal(amount, balance);
    }
}
