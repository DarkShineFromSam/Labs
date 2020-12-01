package Instrumentariy.Lab4;

public abstract class Contribution {
    private String name;
    private int deposit;
    private int persent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPersent() {
        return persent;
    }

    public void setPersent(int persent) {
        this.persent = persent;
    }

//    public int calculateSum (int month){
//        this.setDeposit(this.getDeposit()*month*getPersent());
//    }
}
