package Instrumentariy.Lab3.Task2.Sample;

public class Depositor {
    private String depositorName;
    private int depositorSum;
    private Filial filial;

    public Depositor(Filial filial, String depositorName) {
        this.filial = filial;
        this.depositorName = depositorName;
        this.depositorSum = depositorSum;
        filial.addMyDepositor(depositorName);
        filial.setFilialBalance(filial.getFilialBalance()+depositorSum);
    }

    public String getDepositorName() {
        return depositorName;
    }

    public void setDepositorName(String depositorName) {
        this.depositorName = depositorName;
        filial.addMyDepositor(depositorName);
    }


    public int getDepositorSum() {
        return depositorSum;
    }


    public void addDepositorSum(int addDepositorSum) {
        this.depositorSum = getDepositorSum() + addDepositorSum;
        filial.setFilialBalance(filial.getFilialBalance()+ addDepositorSum);
    }

    @Override
    public String toString() {
        return "Вклад{" +
                "Имя вкладчика ='" + depositorName + '\'' +
                ", Сумма вклада=" + depositorSum +
                ", Филиал=" + filial.getFilialName() +
                '}';
    }
}
