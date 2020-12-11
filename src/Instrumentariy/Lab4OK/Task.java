package Instrumentariy.Lab4OK;

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
    public static void main(String[] args) {

        Bank sberbank = new Bank("Сбер");

        Branch branch = new Branch("South Branch",0);

        // Add Branch to Bank
        sberbank.addBranch(branch);

        LongContribution gazprom = new LongContribution(branch,"Gazprom",100000);
        LongContribution lukoil = new LongContribution(branch,"Lukoil",25000);

        DemandDeposit mts = new DemandDeposit(branch,"MTS", 1000);
        DemandDeposit megafon = new DemandDeposit(branch,"Megafon", 21000);
        DemandDeposit svaznoy = new DemandDeposit(branch,"Svaznoy",35000);

        branch.addDeposit(gazprom);
        branch.addDeposit(lukoil);
        branch.addDeposit(mts);
        branch.addDeposit(megafon);
        branch.addDeposit(svaznoy);

        // Add contribution to branch
        mts.calculate(10);
        System.out.println(sberbank);


    }
}
