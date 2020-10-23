package Costumers;

public class Account {

    Costumer owner;
    int accountId;
    Double balance;

    public Account(Costumer owner, int accountId) {
        this.owner = owner;
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public Costumer getOwner() {
        return owner;
    }

    public void setOwner(Costumer owner) {
        this.owner = owner;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if ((balance - amount) >= 0){
            balance -= amount;
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "\nowner=" + owner +
                "\n accountId=" + accountId +
                "\n balance=" + balance +
                '}';
    }

}
