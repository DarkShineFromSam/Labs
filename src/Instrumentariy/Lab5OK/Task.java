package Instrumentariy.Lab5OK;

/*
  Классы	        Свойства
  --------------------------------------------------
  Банк	            название (get, set)
  --------------------------------------------------
  Филиал	        название (get, set)
                    общая сумма вкладов (get, set)
  --------------------------------------------------
  Вклад	            фио вкладчика (get, set)
                    сумма вклада (get, set)
  --------------------------------------------------
 */

import Instrumentariy.Lab5OK.Exceptions.LessMonthException;

/**
 *
 * Предположим, что все Вклады делятся на два типа:
 * Долгосрочный  - начисления процентов по вкладу зависят от суммы (до 10000 – 12%, больше 10000 – 18% годовых)
 * До востребования  (6% годовых независимо от суммы вклада)
 *
 * Предполагаем, что проценты по вкладу начисляются каждый месяц.
 * Требуется рассчитывать сумму вклада, по прошествии указанного количества месяцев.
 *
 * для этого выполнить следующие действия:
 * -сделать класс Вклад абстрактным (abstract)
 * -добавить в класс Вклад абстрактный метод «рассчитать сумму вклада» с параметром «количество месяцев»
 * -создать классы «Долгосрочный вклад» и «Вклад до востребования», унаследовать их от класса Вклад
 * -перегрузить метод «рассчитать сумму вклада (количество месяцев)» в классах «Долгосрочный вклад» и «Вклад до востребования».
 *
 * В определенный филиал добавить два долгосрочных вклада и три вклада до востребования.
 * Используя цикл for рассчитать и вывести на экран первоначальную сумму и сумму по прошествии трех месяцев каждого вклада данного филиала.
 */

public class Task {
    public static void main(String[] args) throws LessMonthException {

        Bank sberbank = new Bank("Сбер");

        Branch branch = new Branch("South Branch",0);

        // Add Branch to Bank
        sberbank.addBranch(branch);

        Contribution gazprom = new LongContribution(branch,"Gazprom",1000);
        Contribution lukoil = new LongContribution(branch,"Lukoil",25000);

        Contribution mts = new DemandDeposit(branch,"MTS", 1000);
        Contribution megafon = new DemandDeposit(branch,"Megafon", 21000);
        Contribution svaznoy = new DemandDeposit(branch,"Svaznoy",35000);

        // Add contribution to branch
        branch.addDeposit(gazprom);
        branch.addDeposit(lukoil);
        branch.addDeposit(mts);
        branch.addDeposit(megafon);
        branch.addDeposit(svaznoy);

        System.out.print(gazprom);
        System.out.print(lukoil);
        System.out.print(mts);
        System.out.print(megafon);
        System.out.print(svaznoy);

        branch.getContributions(20);

        System.out.println();
        System.out.print(gazprom);
        System.out.print(lukoil);
        System.out.print(mts);
        System.out.print(megafon);
        System.out.print(svaznoy);
        System.out.println();

    }
}
