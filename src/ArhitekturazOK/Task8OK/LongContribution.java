package ArhitekturazOK.Task8OK;

public class LongContribution extends Contribution {

    public LongContribution(Branch branch, String depositorName, int deposit) {
        super(branch, depositorName, deposit);
    }

    @Override
    public void calculate(int month) {
        if (month > 12) {
            if (getDeposit() > 10000) {
                for (int i = 0; i < month; i++) {
                    setPercent(getPercent() + (getDeposit() * 18 / 100));
                }
                setDeposit(getDeposit() + getPercent());
            }
            else {
                for (int i = 0; i < month; i++) {
                    setPercent(getPercent() + (getDeposit() * 12 / 100));
                }
                setDeposit(getDeposit() + getPercent());
            }
        }
    }

}
