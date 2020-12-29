package ArhitekturazOK.Task8OK;

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
  Долгосрочный      рассчитать сумму
  вклад	            вклада (количество месяцев)
  --------------------------------------------------
  Вклад до          рассчитать сумму
  востребования	    вклада (количество месяцев)
  --------------------------------------------------
 */

/**
 * Создать открытые (Public) конструкторы для классов Банк, Филиал, Вклад, Долгосрочный вклад, Вклад до востребования.
 * Конструкторы должны принимать в качестве параметров значения простых (не множественных) свойств, описанных в соответствующем классе.
 * Конструкторы дочерних классов (Долгосрочный вклад и Вклад до востребования) должны вызывать конструктор базового класса (Вклад)
 *
 * 	В основной программе (main) при создании объектов задавать значения свойств. Проверить работу программы.
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

        // Add contribution to branch
        branch.addDeposit(gazprom);
        branch.addDeposit(lukoil);
        branch.addDeposit(mts);
        branch.addDeposit(megafon);
        branch.addDeposit(svaznoy);

        System.out.println(mts);
        mts.calculate(10);
        System.out.println(mts);


    }
}
