
package Arhitektura.Task7OK.Task3;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private int balance;
    private final List<Deposit> deposits = new ArrayList<>();

    public Branch(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Gets branch name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets branch name.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void addDeposit(Deposit deposit) {
        this.deposits.add(deposit);
    }

    public Deposit getDeposit(String depositorName) {
        for (Deposit i : deposits){
            if (i.getName().equals(depositorName)){
                return i;
            }
        }
        return null;
    }
}