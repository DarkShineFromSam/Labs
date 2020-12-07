package Instrumentariy.Lab4;

public class DemandDeposit extends Contribution{

    public DemandDeposit(String depositorName, int deposit) {
        super(depositorName, deposit);
    }

    @Override
    public void calculate(int month) {
        for (int i = 0; i < month; i++) {
            setPercent(getPercent() + (getDeposit() * 6 / 100));
        }
        setDeposit(getDeposit() + getPercent());
    }

}
