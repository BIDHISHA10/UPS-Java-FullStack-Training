
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful");
    }

    void checkBalance() {
        System.out.println("Available balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            account.checkBalance();
        }
    }
}
