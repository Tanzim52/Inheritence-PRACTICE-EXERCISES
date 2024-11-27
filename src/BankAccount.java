public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

public class BasicAccount extends BankAccount {
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            return false;
        }
        return super.withdraw(amount);
    }
}

// Test Program
public class BasicAccountTest {
    public static void main(String[] args) {
        BasicAccount acc = new BasicAccount();
        acc.deposit(100);
        System.out.println("Withdraw $50: " + acc.withdraw(50)); // true
        System.out.println("Withdraw $60: " + acc.withdraw(60)); // false
    }
}
