package Instrumentariy.Lab3.Task1;

/**
 * Смоделировать структуру банка:
 * Класс            Свойства
 * ________________________________________________
 * Банк	            название (get, set)
 * ________________________________________________
 * Филиал	        название (get, set)
 *                  общая сумма вкладов (get, set)
 * _________________________________________________
 * Вклад	        фио вкладчика (get, set)
 *                  сумма вклада (get, set)
 *__________________________________________________
 * Создать один объект класса Банк,
 * два объекта – Филиала,
 * и три вклада, задать значения свойств, вывести на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Branch branch = new Branch();
        Branch branch1 = new Branch();
        Depositor depositor = new Depositor();
        Depositor depositor1 = new Depositor();
        Depositor depositor2 = new Depositor();

        bank.setBankName("Sberbank");
        branch.setBranchName("branch");
        branch.setDeposits(5000);
        branch1.setBranchName("branch1");
        branch1.setDeposits(1000);
        depositor.setDepositorName("depositor");
        depositor.setDeposit(1000);
        depositor1.setDepositorName("depositor1");
        depositor1.setDeposit(1000);
        depositor2.setDepositorName("deposito2");
        depositor2.setDeposit(2000);

        System.out.println(bank.getBankName()+"\n"
                +branch.getBranchName()+" "+branch.getDeposits()+"\n"
                +branch1.getBranchName()+" "+branch1.getDeposits()+"\n"
                +depositor.getDepositorName()+" "+depositor.getDeposit()+"\n"
                +depositor1.getDepositorName()+" "+depositor1.getDeposit()+"\n"
                +depositor2.getDepositorName()+" "+depositor2.getDeposit()+"\n");
    }
}
