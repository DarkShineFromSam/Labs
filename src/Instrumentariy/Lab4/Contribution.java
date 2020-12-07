package Instrumentariy.Lab4;

public abstract class Contribution {
    private String name;
    private int deposit;
    private int percent;
    private int cleanPers;

    public Contribution(String depositorName, int deposit) {
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

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public abstract void calculate(int month);
}
