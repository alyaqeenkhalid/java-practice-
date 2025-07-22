public class BankAccount {
    // Private variables - encapsulation
    private String accountNumber;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Set values using setters
        account.setAccountNumber("123456789");
        account.setBalance(2500.75);

        // Get and print values using getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
