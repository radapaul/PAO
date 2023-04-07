package Entity;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CarHybrid extends Car{
    private String TipCombustibil;
    private int CapacitateRezervor;
    private int CapacitateBaterie;

    public CarHybrid(){}
    public CarHybrid(int an, int vitMax, int greutate, int autonomie, String nume, String model, String tipCombustibil, int capacitateRezervor, int capacitateBaterie) {
        super(an, vitMax, greutate, autonomie, nume, model);
        TipCombustibil = tipCombustibil;
        CapacitateRezervor = capacitateRezervor;
        CapacitateBaterie = capacitateBaterie;
    }

    public String getTipCombustibil() {
        return TipCombustibil;
    }

    public void setTipCombustibil(String tipCombustibil) {
        TipCombustibil = tipCombustibil;
    }

    public int getCapacitateRezervor() {
        return CapacitateRezervor;
    }

    public void setCapacitateRezervor(int capacitateRezervor) {
        CapacitateRezervor = capacitateRezervor;
    }

    public int getCapacitateBaterie() {
        return CapacitateBaterie;
    }

    public void setCapacitateBaterie(int capacitateBaterie) {
        CapacitateBaterie = capacitateBaterie;
    }

    @Override
    public void CalcAutonomie() {
        setAutonomie (CapacitateRezervor / (sqrt(getGreutate())) + CapacitateBaterie / (getGreutate() * getGreutate()));
    }

    @Override
    public void print() {
        System.out.print("CarHybrid{" +
                "TipCombustibil='" + TipCombustibil + '\'' +
                ", CapacitateRezervor=" + CapacitateRezervor +
                ", CapacitateBaterie=" + CapacitateBaterie +
                ", ");
        super.print();
    }

    @Override
    public void read_car() {
        super.read_base_car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Capacitate baterie : ");
        setCapacitateBaterie(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Capacitate rezervor : ");
        setCapacitateRezervor(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tip combustibil : ");
        setTipCombustibil(scanner.nextLine());
        CalcAutonomie();
    }
}
