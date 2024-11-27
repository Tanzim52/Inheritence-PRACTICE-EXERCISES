import java.time.LocalDate;

public class CheckingAccount extends BankAccount {
    private LocalDate lastOverdraftMonth = null;
    private boolean firstOverdraft = true;

    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            LocalDate currentMonth = LocalDate.now().withDayOfMonth(1);
            if (!currentMonth.equals(lastOverdraftMonth)) {
                lastOverdraftMonth = currentMonth;
                firstOverdraft = true;
            }

            if (firstOverdraft) {
                firstOverdraft = false;
                super.withdraw(20); // $20 penalty
            } else {
                super.withdraw(30); // $30 penalty
            }
            return false;
        }
        return super.withdraw(amount);
    }
}

// Test Program
public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(100);
        acc.withdraw(120); // $20 penalty
        acc.withdraw(130); // $30 penalty
        System.out.println("Balance: $" + acc.getBalance());
    }
}
