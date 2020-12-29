package ArhitekturazOK.Task7OK.Task1;

public class Branch {
    private String name;
    private int deposit;

    // Constructor.
    public Branch(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposit() {
        return this.deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
