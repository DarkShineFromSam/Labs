package Instrumentariy.Lab3.Task2.Sample;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList filials = new ArrayList();
    private Filial filial;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getFilials(){
        return filials;
    }

    public void addFilial(String filial){
        filials.add(filial);
    }

    public void removeFelial(String filialName) {
        filials.remove(filialName);
    }

    @Override
    public String toString() {
        return "Bank{" +
                " Название ='" + getName() + '\'' +
                ", Филиалы=" + filials +
                '}';
    }
}
