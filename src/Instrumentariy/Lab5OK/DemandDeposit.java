package Instrumentariy.Lab5OK;

import Instrumentariy.Lab5OK.Exceptions.LessMonthException;

public class DemandDeposit extends Contribution {


    public DemandDeposit(Branch branch, String depositorName, int deposit) throws LessMonthException {
        super(branch, depositorName, deposit);
    }

    @Override
    public void calculate(int month) {
        try {
            if (month < 1) throw new LessMonthException("Вклад должен быть минимум на 1 месяц.");
            for (int i = 0; i < month; i++) {
                setPercent(getPercent() + (getDeposit() * 6 / 100));
                setDeposit(getDeposit() + getPercent());
            }
        } catch (LessMonthException e) {
                e.printStackTrace();
            }


        }
    }

