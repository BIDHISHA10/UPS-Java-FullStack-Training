import java.util.Scanner;

class ATM {
    private int balance = 1000;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = atm.sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you");
                    atm.sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}