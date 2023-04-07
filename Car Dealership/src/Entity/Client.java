package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Client extends User implements Comparable{
    private int ID;
    private String usage;
    private float taxes;
    private static int cnt;

    private ArrayList<Tranzactie> Tranzactii = new ArrayList<>();

    static{
        cnt=0;
    }
    public Client(){}
    public Client(String name, String email, String usage, float taxes, ArrayList<Tranzactie> tranzactii) {
        super(name, email);
        this.ID = cnt;
        this.usage = usage;
        this.taxes = taxes;
        Tranzactii = tranzactii;
        cnt++;
    }

    public Tranzactie add_transaction(){
        Date date = new Date();
        ArrayList<Car> Cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of cars : ");
        int nr=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<nr;i++){
            System.out.println("Tip masina ( 1 - STANDARD  |  2 - ELECTRIC  |  3 - HYBRID  |  4 - MOTORCYCLE )");
            int n = scanner.nextInt();
            if (n == 1) {
                int x = scanner.nextInt();
                if (x == 1) {
                    Car c = new CarStandard();
                    c.read_car();
                    Cars.add(c);
                }
            } else if (n == 2) {
                Car c = new CarElectric();
                c.read_car();
                Cars.add(c);
            } else if (n == 3) {
                Car c = new CarHybrid();
                c.read_car();
                Cars.add(c);
            } else if (n == 4) {
                Car c = new Motorcycle();
                c.read_car();
                Cars.add(c);
            }
        }
        Tranzactie T = new Tranzactie(date,Cars);
        return T;
    }


    public static Client read_client(){
        User c = new Client();
        c.read();
        return (Client) c;
    }

    public void read(){
        super.read_base_user();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usage : ");
        setUsage(scanner.nextLine());
        System.out.print("Taxe : ");
        setTaxes(scanner.nextFloat());
        scanner.nextLine();
    }

    public int getID() {
        return ID;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
    public void addT(Tranzactie T) { Tranzactii.add(T);}

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public ArrayList<Tranzactie> getTranzactii() {
        return Tranzactii;
    }

    public void setTranzactii(ArrayList<Tranzactie> tranzactii) {
        Tranzactii = tranzactii;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", usage='" + usage + '\'' +
                ", taxes=" + taxes +
                ", Tranzactii=" + Tranzactii +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
