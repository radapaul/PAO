package Entity;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CarStandard extends Car {
    private String TipCombustibil;
    private int CapacitateRezervor;

    public CarStandard(){}
    public CarStandard(int an, int vitMax, int greutate, int autonomie, String nume, String model, String tipCombustibil, int capacitateRezervor) {
        super(an, vitMax, greutate, autonomie, nume, model);
        TipCombustibil = tipCombustibil;
        CapacitateRezervor = capacitateRezervor;
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

    @Override
    public void print() {
        System.out.print("CarStandard{" +
                "TipCombustibil='" + TipCombustibil + '\'' +
                ", CapacitateRezervor=" + CapacitateRezervor +", ");
        super.print();
    }

    @Override
    public void CalcAutonomie() {
        setAutonomie(CapacitateRezervor / (sqrt(getGreutate())));
    }

    @Override
    public void read_car() {
        super.read_base_car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tip combustibil : ");
        setTipCombustibil(scanner.nextLine());
        System.out.print("Capacitate rezervor : ");
        setCapacitateRezervor(scanner.nextInt());
        scanner.nextLine();
        CalcAutonomie();
    }
}
