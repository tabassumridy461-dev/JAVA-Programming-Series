class BankAccount {

    // Private Variables
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }

    // Getter Method
    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Tabassum", 5000);

        account.deposit(1000);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Balance: " + account.getBalance());

        /*
        Output:
        Account Holder: Tabassum
        Balance: 6000.0
        */
    }
}
