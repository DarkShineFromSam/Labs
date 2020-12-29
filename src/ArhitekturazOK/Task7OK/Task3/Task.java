package ArhitekturazOK.Task7OK.Task3;

/**
 * Смоделировать структуру банка:
 * Класс            Свойства
 * ------------------------------------------------
 * Банк	            название (get, set)
 * ------------------------------------------------
 * Филиал	        название (get, set)
 *                  общая сумма вкладов (get, set)
 * ------------------------------------------------
 * Вклад	        фио вкладчика (get, set)
 *                  сумма вклада (get, set)
 * ------------------------------------------------
 * добавить в класс Банк метод, осуществляющий поиск вклада по ФИО вкладчика.
 * Метод содержит входной параметр ФИО (String) и возвращает значение типа Вклад.
 * Осуществить поиск в main(), вывести сумму найденного вклада на экран, и отобразить, в каком филиале он размещен.
 */

public class Task {
    public static void main(String[] args) {
        // Create a bank.
        Bank bank = new Bank("Stir`bank");

        // Create branches.
        Branch northBranch = new Branch("North branch", 0);
        Branch southBranch = new Branch("South branch", 0);

        bank.addBranch(northBranch);
        bank.addBranch(southBranch);

        // Create depositor with deposit.
        Deposit gazprom = new Deposit("Gazprom", 1000);
        Deposit megafon = new Deposit("Megafon", 4000);
        Deposit beeline = new Deposit("Beeline", 6000);

        northBranch.addDeposit(gazprom);
        southBranch.addDeposit(megafon);
        northBranch.addDeposit(beeline);

        bank.findDepositByName("Megafon");
    }
}
