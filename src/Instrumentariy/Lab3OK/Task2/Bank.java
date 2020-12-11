package Instrumentariy.Lab3OK.Task2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private final List<Filial> Filial;

    public Bank(String name) {
        this.name = name;
        this.Filial = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filial> getFilials(){
        return Filial;
    }

    public void addFilial(Filial filial){
        this.Filial.add(filial);
        filial.setFilialName(filial.getFilialName());
        filial.setBank(this);
    }

    public void removeFelial(Filial filialName) {
        Filial.remove(filialName);
    }

    @Override
    public String toString() {
        return "\nBank:     " + name + Filial;
    }
}
