package ArhitekturazOK.Task8OK;

public class Contribution {
    private final String name;
    private int deposit;
    private int percent;
    private final Branch branch;

    public Contribution(Branch branch, String depositorName, int deposit) {
        this.name = depositorName;
        this.deposit = deposit;
        this.branch = branch;
        this.branch.setBalance(this.branch.getBalance()+deposit);
    }

    public String getName() {
        return this.name;
    }

    public void addDeposit(int deposit) {
        this.branch.setBalance(this.branch.getBalance()+deposit);
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

    public void calculate(int month){}

    @Override
    public String toString() {
        return "\nВклад:    " + name +
                " | Баланс: " + deposit +
                " | Процент: " + percent;
    }
}
