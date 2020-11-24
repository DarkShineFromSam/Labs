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
        Bank bank = new Bank("Sber");
        Filial filial = new Filial(bank,"Sber1");
        Filial filial1 = new Filial(bank,"Sber2");
        Depositor depositor = new Depositor(filial,"Dep1");
        Depositor depositor1 = new Depositor(filial, "Dep2");
        Depositor depositor2 = new Depositor(filial1,"Dep3");
        Depositor depositor3 = new Depositor(filial1,"Dep4");
        depositor.addDepositorSum(5000);
        depositor1.addDepositorSum(4000);
        depositor2.addDepositorSum(3000);
        depositor3.addDepositorSum(2000);

        depositor2.addDepositorSum(10000);

        System.out.println(filial);

    }
}
