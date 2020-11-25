package Instrumentariy.Lab3.Task1;

public class Depositor {
    private String name;
    private int deposit;

    // Constructor.
    public Depositor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
