
package Instrumentariy.Lab5OK;

import Instrumentariy.Lab5OK.Exceptions.LessMonthException;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private int balance;
    private final List<Contribution> contributions = new ArrayList<>();

    public Branch(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    // Gets branch name.
    public String getName() {
        return this.name;
    }

    // Sets branch name.
    public void setName(String name) {
        this.name = name;
    }

    public void addDeposit(Contribution contribution) {
        this.contributions.add(contribution);
        this.setBalance(this.getBalance()+contribution.getDeposit()+(contribution.getPercent() - contribution.getDeposit()));
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Contribution getDeposit(String depositorName) {
        for (Contribution i : contributions){
            if (i.getName().equals(depositorName))
                return i;
        }
        return null;
    }
    public int getContributions (int month) throws LessMonthException {
        for(Contribution contribution : contributions ) {
            contribution.calculate(month);
        } return 0;
    }

    @Override
    public String toString() {
        return  "Филиал:   " + name +
                "| Баланс: " + balance +" "
                + contributions;
    }
}