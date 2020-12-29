package ArhitekturazOK.Task7OK.Task1;

/**
 * Смоделировать структуру банка:
 * Класс            Свойства
 * ------------------------------------------------
 * Банк	            название (get, set)
 * ------------------------------------------------
 * Филиал	        название (get, set)
 * общая сумма вкладов (get, set)
 * ------------------------------------------------
 * Вклад	        фио вкладчика (get, set)
 * сумма вклада (get, set)
 * ------------------------------------------------
 * Создать:
 * один объект типа `Банк`,
 * два объекта типа `Филиал`,
 * и три вклада, задать значения свойств, вывести на экран.
 */
public class Task {
    public static void main(String[] args) {
        // Create a bank.
        Bank cityBank = new Bank("Sberbank");

        // Create branches.
        Branch northBranch = new Branch("North branch", 0);
        Branch southBranch = new Branch("South branch", 0);

        // Create depositors.
        Depositor depositorGazprom = new Depositor("Gazprom");
        Depositor depositorBeeline = new Depositor("Beeline");
        Depositor depositorMegafon = new Depositor("Megafon");

        // Let depositors make a deposit to certain bank.
        depositorGazprom.setDeposit(1000);
        depositorBeeline.setDeposit(2000);
        depositorMegafon.setDeposit(3000);

        System.out.println("Bank: " + cityBank.getName() + "\n\n"
                + "Branches: \n"
                + northBranch.getName() + " -> " + northBranch.getDeposit() + "\n"
                + southBranch.getName() + " -> " + southBranch.getDeposit() + "\n\n"
                + "Deposits: \n"
                + depositorGazprom.getName() + " -> " + depositorGazprom.getDeposit() + "\n"
                + depositorBeeline.getName() + " -> " + depositorBeeline.getDeposit() + "\n"
                + depositorMegafon.getName() + " -> " + depositorMegafon.getDeposit() + "\n"
        );
    }
}
