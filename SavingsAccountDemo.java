// User-defined exception for withdrawal exceeding balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// SavingsAccount class with accountNumber and balance attributes
class SavingsAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize accountNumber and balance
    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit amount into the account
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    // Method to withdraw amount from the account, handles InsufficientBalanceException
    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class SavingsAccountDemo {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456789", 1000);

        try {
            account.depositAmount(500);
            account.withdrawAmount(700);
            account.withdrawAmount(1000); // This will throw an exception
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
