import controllers.AccountController;
import models.Account;

public class Main {
    public static void main(String[] args) {
        AccountController controller = new AccountController();
        Account account1 = controller.createAccount("12345", "Alice", 500.0);
        Account account2 = controller.createAccount("67890", "Bob", 300.0);

        controller.deposit(account1, 200.0);
        controller.withdraw(account1, 100.0);
        controller.transfer(account1, account2, 150.0);

        System.out.println(account1.getAccountDetails());
        System.out.println(account2.getAccountDetails());
    }
}