package ArhitekturazOK.Task9OK;

import ArhitekturazOK.Task9OK.Exceptions.LessMonthException;

public abstract class Contribution {
    private final String name;
    private int deposit;
    private int percent;
    private final Branch branch;

    public Contribution(Branch branch, String depositorName, int deposit) throws LessMonthException {
        this.name = depositorName;
        this.deposit = deposit;
        this.branch = branch;
        this.branch.setBalance(this.branch.getBalance()+deposit);
        try { if (deposit < 0) throw new LessMonthException("Вклад должен быть положительным.");}
        catch (LessMonthException e){
            e.printStackTrace();
        }
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

    public abstract void calculate(int month) throws LessMonthException;

    @Override
    public String toString() {
        return "\nВклад:    " + name +
                " | Баланс: " + deposit +
                " | Процент: " + percent;
    }
}
