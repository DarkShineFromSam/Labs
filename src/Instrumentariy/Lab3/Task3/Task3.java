package Instrumentariy.Lab3.Task3;

/**
 * Смоделировать структуру банка:
 * Класс            Свойства
 * ________________________________________________
 * Банк	            название (get, set)
 * ________________________________________________
 * Филиал	        название (get, set)
 *                   общая сумма вкладов (get, set)
 * _________________________________________________
 * Вклад	        фио вкладчика (get, set)
 *                  сумма вклада (get, set)
 * __________________________________________________
 * добавить в класс Банк метод, осуществляющий поиск вклада по ФИО вкладчика.
 * Метод содержит входной параметр ФИО (String) и возвращает значение типа Вклад.
 * Осуществить поиск в main(), вывести сумму найденного вклада на экран, и отобразить, в каком филиале он размещен.
 */

public class Task3 {
    public static void main(String[] args) {
        // Create a bank.
        Bank cityBank = new Bank("Sberbank");

        // Create filials.
        Filial northBranch = new Filial(cityBank,"North branch");
        Filial southBranch = new Filial(cityBank,"South branch");

        // Create branches.
        Depositor depositorGazprom = new Depositor(northBranch,"Gazprom");
        Depositor depositorBeeline = new Depositor(northBranch, "Beeline");
        Depositor depositorMegafon = new Depositor(southBranch,"Megafon");

        // Let depositors add a deposit to certain bank.
        depositorGazprom.addDepositorSum(5000);
        depositorBeeline.addDepositorSum(4000);
        depositorMegafon.addDepositorSum(3000);
        depositorMegafon.addDepositorSum(10000);
        //System.out.println(cityBank);
        System.out.println(northBranch.isContains("Gazprom"));



    }
}
