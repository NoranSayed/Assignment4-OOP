public class BankAccount {
    private int accountId;
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
    BankAccount()
    {
        this.balance=0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public boolean withdraw(double amount ){
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public boolean  deposit (double amount )
    {
        if (amount <= 0)
            return false;
        balance+=amount;
        return true;
    }
}
