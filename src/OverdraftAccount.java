public class OverdraftAccount extends BankAccount {
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            super.withdraw(getBalance()); // Deplete balance
            super.withdraw(30); // Charge penalty
            return false;
        }
        return super.withdraw(amount);
    }
}

// Test Program
public class OverdraftAccountTest {
    public static void main(String[] args) {
        OverdraftAccount acc = new OverdraftAccount();
        acc.deposit(100);
        System.out.println("Withdraw $120: " + acc.withdraw(120)); // false, $30 penalty
        System.out.println("Balance after overdraft: $" + acc.getBalance());
    }
}
