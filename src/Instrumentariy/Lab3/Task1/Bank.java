package Instrumentariy.Lab3.Task1;

public class Bank {
    private String name;

    // Constructor.
    public Bank(String name) {
        this.name = name;
    }

    /**
     * Get the bank name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the bank name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
