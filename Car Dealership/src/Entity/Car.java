package Entity;

import java.util.Scanner;

public abstract class Car {
    private int An,VitMax,Greutate;
    private double Autonomie;
    private String Nume,Model;

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Car(){}
    public Car(int an, int vitMax, int greutate, int autonomie, String nume, String model) {
        An = an;
        VitMax = vitMax;
        Greutate = greutate;
        Autonomie = autonomie;
        Nume = nume;
        Model = model;
    }

    public abstract void CalcAutonomie();
    public abstract void read_car();

    public void read_base_car(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("An : ");
        setAn(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nume : ");
        setNume(scanner.nextLine());
        System.out.print("Model : ");
        setModel(scanner.nextLine());
        System.out.print("Viteza maxima : ");
        setVitMax(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Greutate : ");
        setGreutate(scanner.nextInt());
        scanner.nextLine();
    }
    public int getAn() {
        return An;
    }

    public void setAn(int an) {
        An = an;
    }

    public int getVitMax() {
        return VitMax;
    }

    public void setVitMax(int vitMax) {
        VitMax = vitMax;
    }

    public int getGreutate() {
        return Greutate;
    }

    public void setGreutate(int greutate) {
        Greutate = greutate;
    }

    public double getAutonomie() {
        return Autonomie;
    }

    public void setAutonomie(double autonomie) {
        Autonomie = autonomie;
    }

    public String getNume() {
        return Nume;
    }

    public String getModel() {
        return Model;
    }


    public void print() {
        System.out.print(
                "An=" + An +
                ", VitMax=" + VitMax +
                ", Greutate=" + Greutate +
                ", Autonomie=" + Autonomie +
                ", Nume='" + Nume + '\'' +
                ", Model='" + Model + '\'' +
                '}');
    }
}
