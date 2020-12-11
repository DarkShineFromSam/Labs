package Instrumentariy.Lab4OK;

public class DemandDeposit extends Contribution{


    public DemandDeposit(Branch branch, String depositorName, int deposit) {
        super(branch, depositorName, deposit);
    }

    @Override
    public void calculate(int month) {
        for (int i = 0; i < month; i++) {
            setPercent(getPercent() + (getDeposit() * 6 / 100));
        }
        setDeposit(getDeposit() + getPercent());
    }
}
