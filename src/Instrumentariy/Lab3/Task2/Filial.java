
package Instrumentariy.Lab3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String filialName;
    private int filialBalance=0;
    private Bank bank;
    private List<Depositor> myDepositors;

    public Filial() {
    }

    public Filial(Bank bank, String filialName) {
        this.bank = bank;
        this.filialName = filialName;
        this.bank.addFilial(this);
        this.myDepositors = new ArrayList<>();
    }

    public String getFilialName() {
        return filialName;
    }

    public void setFilialName(String filialName) {
        this.filialName = filialName;
    }

    public int getFilialBalance() {
        return filialBalance;
    }

    public void setFilialBalance(int filialBalance) {
        this.filialBalance = filialBalance;
    }

    public List<Depositor> getMyDepositors(){
        return myDepositors;
    }

    public void addMyDepositor(Depositor depositor) {
        this.myDepositors.add(depositor);
    }

    public void removeMyDepositor(Depositor depositor) {
        this.myDepositors.remove(depositor);
    }

    public String getBank() {
        return bank.getName();
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "Название филиала='" + filialName + "\'" +
                ", Баланс филиала=" + filialBalance +
                ", Банк=" + bank.getName() +
                ", Вкладчики=" + myDepositors +
                '}';
    }
}