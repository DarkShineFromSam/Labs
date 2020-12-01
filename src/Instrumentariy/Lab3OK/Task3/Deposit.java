package Instrumentariy.Lab3OK.Task3;

public class Deposit {
    private String name;
    private int deposit;

    public Deposit(String depositorName, int deposit) {
        this.name = depositorName;
        this.deposit = deposit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDeposit(int deposit) {
        this.deposit = this.deposit + deposit;
    }

    public int getDeposit() {
        return this.deposit;
    }
}
