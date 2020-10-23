package Costumers;

import java.util.Date;

public class Costumer {

    private String name;
    private Date birthdate;
    private int cpf;
    private String phone;
    private int bankId;
    private int accountId;

    public Costumer(String name, Date birthdate, int cpf, String phone, int bankId, int account) {
        this.name = name;
        this.birthdate = birthdate;
        this.cpf = cpf;
        this.phone = phone;
        this.bankId = bankId;
        this.accountId = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getAccount() {
        return accountId;
    }

    public void setAccount(int account) {
        this.accountId = account;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "\nname='" + name + '\'' +
                "\n birthdate=" + birthdate +
                "\n cpf=" + cpf +
                "\n phone='" + phone + '\'' +
                "\n bankId=" + bankId +
                "\n account=" + accountId +
                '}';
    }

}
