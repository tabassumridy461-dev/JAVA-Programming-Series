public class BankAccount {

    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display account information
    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Tabassum", 10000);

        account.displayAccount();

        account.deposit(5000);

        account.withdraw(3000);

        account.displayAccount();
    }
}

/*
Output:
Account Holder: Tabassum
Current Balance: 10000.0
Deposited: 5000.0
Withdrawn: 3000.0
Account Holder: Tabassum
Current Balance: 12000.0
*/
