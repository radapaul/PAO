import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ok=true;
        System.out.println("1 - Adauga model masina\n" +
                "2 - Afisare modele\n" +
                "3 - Remove model\n" +
                "4 - Optimizare model (Marire viteza max procentual)\\n\n" +
                "5 - Adauga angajat\n" +
                "6 - Remove angajat\n" +
                "7 - Adauga tranzactie\n" +
                "8 - Afiseaza cel mai vandut model\n" +
                "9 - Afiseaza modelul cu autonomia cea mai mare\n" +
                "10 - Stop");
        while(ok){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            switch(n){
                case 1:
                    Service.add_car();
                    break;
                case 2:
                    Service.show_cars();
                    break;
                case 3:
                    Service.remove_car();
                    break;
                case 4:
                    Service.optimize();
                    break;
                case 5:
                    Service.add_employee();
                    break;
                case 6:
                    Service.remove_employee();
                    break;
                case 7:
                    Service.add_transaction();
                    break;
                case 8:
                    Service.best_sold();
                    break;
                case 9:
                    Service.best_autonomy();
                    break;
                case 10:
                    ok=false;
                    break;
                default:
                    System.out.println("Invalid option\n");
                    break;
            }
        }
    }
}