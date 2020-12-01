
package Instrumentariy.Lab3OK.Task3;

import java.util.HashMap;

public class Branch {
    private String name;
    private int balance;
    private final HashMap<String, Deposit> deposits = new HashMap<>();

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
        this.deposits.put(deposit.getName(), deposit);
    }

    public Deposit getDeposit(String depositorName) {
        return this.deposits.get(depositorName);
    }
}