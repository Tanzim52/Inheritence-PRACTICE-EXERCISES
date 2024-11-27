public class CheckingAccount1 {
    private double balance;
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 1.0;

    public CheckingAccount1() {
        balance = 0;
        transactionCount = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        applyTransactionFee();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private void applyTransactionFee() {
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= TRANSACTION_FEE;
        }
    }

    public void resetTransactions() {
        transactionCount = 0;
    }

    public double getBalance() {
        return balance;
    }
}

// Test Program
public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(100);
        acc.deposit(50);
        acc.withdraw(30);
        acc.withdraw(10); // This transaction incurs a $1 fee
        acc.deposit(20); // This transaction incurs a $1 fee
        System.out.println("Balance: $" + acc.getBalance()); // Should reflect fees
    }
}
