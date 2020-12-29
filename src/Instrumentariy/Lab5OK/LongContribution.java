package Instrumentariy.Lab5OK;

import Instrumentariy.Lab5OK.Exceptions.LessMonthException;

public class LongContribution extends Contribution {

    public LongContribution(Branch branch, String depositorName, int deposit) throws LessMonthException {
        super(branch, depositorName, deposit);
    }

    @Override
    public void calculate(int month) {

        try {
            if (month < 0) throw new LessMonthException("Срок вклада не может быть отрицательным.");

            try {
                if (month < 12) throw new LessMonthException("Срок вклада не может быть меньше 12 месяцев.");
                if (getDeposit() > 10000) {
                    for (int i = 0; i < month; i++) {
                        setPercent(getPercent() + (getDeposit() * 18 / 100));
                    }
                    setDeposit(getDeposit() + getPercent());
                } else {
                    for (int i = 0; i < month; i++) {
                        setPercent(getPercent() + (getDeposit() * 12 / 100));
                    }
                    setDeposit(getDeposit() + getPercent());
                }
            } catch (LessMonthException e) {
                e.printStackTrace();
            }


        } catch (LessMonthException e) {
            e.printStackTrace();
        }
    }
}
