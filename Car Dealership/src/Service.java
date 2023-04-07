import Entity.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service {
    public static Scanner scanner = new Scanner(System.in);
    public static Company company = Company.getInstance();

    public static void add_car() {
        System.out.println("Tip masina ( 1 - STANDARD  |  2 - ELECTRIC  |  3 - HYBRID  |  4 - MOTORCYCLE )");
        int n = scanner.nextInt();
        if (n == 1) {
            Car c = new CarStandard();
            c.read_car();
            company.add_model(c);
        } else if (n == 2) {
            Car c = new CarElectric();
            c.read_car();
            company.add_model(c);
        } else if (n == 3) {
            Car c = new CarHybrid();
            c.read_car();
            company.add_model(c);
        } else if (n == 4) {
            Car c = new Motorcycle();
            c.read_car();
            company.add_model(c);
        }
    }

    public static void show_cars() {
        company.show_cars();
    }

    public static void remove_car() {
        System.out.print("An : ");
        int an = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume : ");
        String nume = scanner.nextLine();
        System.out.print("Model : ");
        String model = scanner.nextLine();
        company.remove_car(nume, model, an);
    }

    public static void optimize() {
        System.out.print("An : ");
        int an = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume : ");
        String nume = scanner.nextLine();
        System.out.print("Model : ");
        String model = scanner.nextLine();
        System.out.print("Procent (doar numarul , fara %) : ");
        float proc = scanner.nextInt();
        scanner.nextLine();
        company.optimize(nume, model, an, proc);
    }

    public static void add_employee() {
        User e = new Employee();
        e.read();
        company.add_employee((Employee) e);
    }

    public static void remove_employee() {
        System.out.println("Nume angajat : ");
        String nume = scanner.nextLine();
        company.remove_employee(nume);
    }

    public static void add_transaction() {
        System.out.print("Nume client : ");
        String nume = scanner.nextLine();
        company.add_transaction(nume);
    }

    public static void best_sold() {
        int max = -1;
        String str = "";
        Map<String, Integer> hm = new HashMap<>();
        for (Client c : company.getClients()) {
            for (Tranzactie t : c.getTranzactii()) {
                for (Car car : t.getModele()) {
                    hm.put(car.getModel(), Collections.frequency(t.getModele(), car.getModel()));
                }
            }
        }
        for (Map.Entry mapElement : hm.entrySet()) {
            String key
                    = (String) mapElement.getKey();
            int value
                    = (int) mapElement.getValue();
            if (max < value) {
                max = value;
                str = key;
            }
        }
        System.out.println(str);
    }
    public static void best_autonomy(){
        double max = -1;
        Car car = null;
        for(Car c : company.getModels()){
            if(c.getAutonomie()>max){
                max=c.getAutonomie();
                car=c;
            }
        }
        car.print();
    }
}
