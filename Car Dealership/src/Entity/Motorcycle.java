package Entity;

import java.util.Scanner;

public class Motorcycle extends CarStandard{
    private int decibels;
    private float ZeroToOneHundred;
    public Motorcycle(){}
    public Motorcycle(int an, int vitMax, int greutate, int autonomie, String nume, String model, String tipCombustibil, int capacitateRezervor, int decibels, float zeroToOneHundred) {
        super(an, vitMax, greutate, autonomie, nume, model, tipCombustibil, capacitateRezervor);
        this.decibels = decibels;
        ZeroToOneHundred = zeroToOneHundred;
    }

    public int getDecibels() {
        return decibels;
    }

    public void setDecibels(int decibels) {
        this.decibels = decibels;
    }

    public float getZeroToOneHundred() {
        return ZeroToOneHundred;
    }

    public void setZeroToOneHundred(float zeroToOneHundred) {
        ZeroToOneHundred = zeroToOneHundred;
    }

    @Override
    public void print() {
        System.out.print("Motorcycle{" +
                "decibels=" + decibels +
                ", ZeroToOneHundred=" + ZeroToOneHundred +
                ", ");
        super.print();
    }
    @Override
    public void read_car() {
        super.read_car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decibels : ");
        setDecibels(scanner.nextInt());
        System.out.print("Zero to one hundred speed : ");
        setZeroToOneHundred(scanner.nextInt());
        CalcAutonomie();
    }
}
