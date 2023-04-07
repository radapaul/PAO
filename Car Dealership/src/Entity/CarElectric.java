package Entity;

import java.util.Scanner;

public class CarElectric extends Car {
    private int CapacitateBaterie;

    public CarElectric(){}
    public CarElectric(int an, int vitMax, int greutate, int autonomie, String nume, String model, int capacitateBaterie) {
        super(an, vitMax, greutate, autonomie, nume, model);
        CapacitateBaterie = capacitateBaterie;
    }

    public int getCapacitateBaterie() {
        return CapacitateBaterie;
    }

    public void setCapacitateBaterie(int capacitateBaterie) {
        CapacitateBaterie = capacitateBaterie;
    }

    @Override
    public void print() {
        System.out.print("CarElectric{" +
                "CapacitateBaterie=" + CapacitateBaterie +
                ", ");
        super.print();
    }

    @Override
    public void CalcAutonomie() {
        setAutonomie((double)(CapacitateBaterie) / ((getGreutate() * getGreutate())));
    }

    @Override
    public void read_car() {
        super.read_base_car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Capacitate baterie : ");
        setCapacitateBaterie(scanner.nextInt());
        scanner.nextLine();
        CalcAutonomie();
    }
}
