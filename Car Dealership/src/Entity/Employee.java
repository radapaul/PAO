package Entity;

import java.util.Scanner;

public class Employee extends User implements Comparable<Employee>{
    private String position;
    private float salary;
    private int ID;

    private static int cnt;

    static{
        cnt=0;
    }

    public void read(){
        super.read_base_user();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitie : ");
        setPosition(scanner.nextLine());
        System.out.print("Salariu : ");
        setSalary(scanner.nextFloat());
        scanner.nextLine();
    }
    public Employee(){}
    public Employee(String name, String email, String position, float salary) {
        super(name, email);
        this.position = position;
        this.salary = salary;
        this.ID = cnt;
        cnt++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
