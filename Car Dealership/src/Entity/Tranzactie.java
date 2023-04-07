package Entity;

import java.util.ArrayList;
import java.util.Date;

public class Tranzactie {
    private Date data;

    private ArrayList<Car> Modele = new ArrayList<>();

    public Tranzactie(Date data, ArrayList<Car> modele) {
        this.data = data;
        Modele = modele;
    }

    public ArrayList<Car> getModele() {
        return Modele;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setModele(ArrayList<Car> modele) {
        Modele = modele;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "data=" + data +
                ", Modele=" + Modele +
                '}';
    }
}
