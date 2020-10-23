package Main;

import Costumers.*;
import Bank.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String address = "Rua Santa Elizabeth, S/N";
        String firstName = "Márzio";
        String secondName = "Rafael";
        Date birthdate = new Date();
        int firstCpf = 95804448;
        int secondCpf = 30440857;
        String firstPhone = "998275441";
        String secondPhone = "998052727";
        int bankId = 1;
        int firstAccountId = 1;
        int secondAccountId = 2;

        Bank bank = new Bank(address, bankId);
        Costumer firstCostumer  = new Costumer(firstName, birthdate, firstCpf, firstPhone, bankId, firstAccountId);
        Account firstAccount = new Account(firstCostumer,firstAccountId);
        bank.addAccount(firstAccount);
        Costumer secondCostumer = new Costumer(secondName, birthdate, secondCpf, secondPhone, bankId, secondAccountId);
        Account secondAccount = new Account(secondCostumer, secondAccountId);
        bank.addAccount(secondAccount);

        System.out.println(bank.toString());
        System.out.println(firstCostumer.toString());
        System.out.println(firstAccount.toString());
        System.out.println(secondCostumer.toString());
        System.out.println(secondAccount.toString());

        System.out.println(firstAccount.getBalance());
        firstAccount.deposit(1200.0);
        System.out.println(firstAccount.getBalance());
        firstAccount.withdraw(500.0);
        System.out.println(firstAccount.getBalance());
    }
}
