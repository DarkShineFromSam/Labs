package Arhitektura.Task7OK.Task2;

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
 *
 * Связать между собой классы Банк, Филиал и Вклад, так, чтобы каждый банк содержал филиалы,
 * каждый филиал содержал указание в каком банке он находится, и какие вклады он содержит,
 * каждый вклад – в каком филиале он размещен.
 *
 * -Добавить в класс Банк множественное свойство «филиалы» (get) и метод «добавить филиал» (add)
 *
 * -Добавить в класс Филиал свойство «банк» (get) и свойство «вклады» (get),
 * а также методы «добавить вклад» (add), «удалить вклад» (remove).
 *
 * Удалить set для свойства «общая сумма вкладов» и сделать так,
 * чтобы данное свойство рассчитывалось автоматически (на основе свойства «вклады»).
 *
 * -Добавить в класс «Вклад» свойство «Филиал»,
 *
 * -Удалить из класса «Вклад» set для свойства «сумма вклада» и добавить
 * метод «пополнить счет (сумма)»
 *
 * Создать один объект класса Банк, в данный банк добавить два филиала,
 * в каждый из филиалов добавить по два вклада.
 *
 * Вывести на экран вклады одного из филиалов, и общую сумму вкладов по этому филиалу.
 *
 * Выполнить пополнение счета одного из вкладов и снова вывести информация о вкладах на экран.
 */

public class Task2 {
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

        System.out.println(northBranch);

    }
}
