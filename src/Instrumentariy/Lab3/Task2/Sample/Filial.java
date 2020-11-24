
package Instrumentariy.Lab3.Task2.Sample;

import java.util.ArrayList;

public class Filial {
    private String filialName;
    private int filialBalance=0;
    private Bank bank;
    private Depositor depositor;
    private ArrayList myDepositor = new ArrayList();

    public Filial(Bank bank, String filialName) {
        this.bank = bank;
        this.filialName = filialName;
        bank.addFilial(filialName);
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

    public ArrayList getMyDepositor(){
        return myDepositor;
    }

    public void addMyDepositor(String depositor) {
        myDepositor.add(depositor);
    }

    public void removeMyDepositor(String depositor) {
        myDepositor.remove(depositor);
    }

    public String getBank() {
        return bank.getName();
    }

    @Override
    public String toString() {
        return "Filial{" +
                "Название филиала='" + filialName + '\'' +
                ", Баланс филиала=" + filialBalance +
                ", Банк=" + bank.getName() +
                ", Вкладчики=" + myDepositor +
                '}';
    }
}