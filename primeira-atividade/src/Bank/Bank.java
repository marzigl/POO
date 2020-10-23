package Bank;

import Costumers.Account;

import java.util.Arrays;

public class Bank {

    private String address;
    private Account accounts[];
    int bankId;
    private int counter;

    public Bank(String address, int bankId) {
        this.address = address;
        this.accounts = new Account[100];
        this.bankId = bankId;
        counter = 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public boolean addAccount(Account newAccount) {
        if (counter < 100) {
            accounts[counter] = newAccount;
            counter++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "\naddress='" + address + '\'' +
                "\n accounts=" + Arrays.toString(accounts) +
                "\n bankId=" + bankId +
                '}';
    }

}
