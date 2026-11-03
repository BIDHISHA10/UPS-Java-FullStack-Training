
class BankAccount {
    private int balance = 500;

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawal requested: " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
        notifyAll();
    }
}

public class ATMExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread customer = new Thread(() -> account.withdraw(1000));

        customer.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        account.deposit(1000);
    }
}
