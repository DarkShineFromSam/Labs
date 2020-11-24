package Instrumentariy.Lab3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Filial> filials;

    public Bank(String name) {
        this.name = name;
        this.filials = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filial> getFilials(){
        return filials;
    }

    public void addFilial(Filial filial){
        this.filials.add(filial);
        filial.setFilialName(filial.getFilialName());
        filial.setBank(this);
    }


    public void removeFelial(String filialName) {
        filials.remove(filialName);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ",filials=" + filials +
                '}';
    }
}
