package Instrumentariy.Lab3.Task3;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Filial> filial;

    public Bank(String name) {
        this.name = name;
        this.filial = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filial> getFilials(){
        return filial;
    }

    public void addFilial(Filial filial){
        this.filial.add(filial);
        filial.setFilialName(filial.getFilialName());
        filial.setBank(this);
    }

    public void removeFelial(String filialName) {
        filial.remove(filialName);
    }

    @Override
    public String toString() {
        return "\nBank: " + name + filial;
    }
}
