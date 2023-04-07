package Entity;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Company {
    private static Company obj = new Company();
    private String name;
    private String address;
    private ArrayList<Car> models = new ArrayList<>();
    private SortedSet<Employee> employees = new TreeSet<Employee>();
    private TreeSet <Client> clients = new TreeSet <>();

    private Company(){}

    public void add_employee(Employee e){
        employees.add(e);
        System.out.println("Angajat adaugat\n");
    }
    public void remove_employee(String nume){
        SortedSet<Employee> aux = getEmployees();
        for(Employee e : aux){
            if(e.getName().equals(nume)){
                aux.remove(e);
                System.out.println("Angajat eliminat\n");
                setEmployees(aux);
                return;
            }
        }
        System.out.println("Angajatul nu exista\n");
    }

    public static Company getInstance() {
        if (obj == null)
            obj = new Company();
        return obj;
    }

    public void add_model(Car c){
        models.add(c);
        System.out.println("Masina adaugata\n");
    }

    public void show_cars(){
        for(Car c : getModels()){
            c.print();
            System.out.println();
        }
    }

    public void remove_car(String nume,String model,int an){
        ArrayList<Car> aux = getModels();
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).getNume().equals(nume) && aux.get(i).getAn()==an && aux.get(i).getModel().equals(model)){
                aux.remove(aux.get(i));
                System.out.println("Masina eliminata\n");
                setModels(aux);
                return;
            }
        }
        System.out.println("Masina nu exista\n");
    }

    public void optimize(String nume,String model,int an,float proc){
        ArrayList<Car> aux = getModels();
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).getNume().equals(nume) && aux.get(i).getAn()==an && aux.get(i).getModel().equals(model)){
                int vit=aux.get(i).getVitMax();
                Car copy = aux.get(i);
                copy.setVitMax((int) (vit + proc / 100 * vit));
                aux.set(i,copy);
                System.out.println("Masina optimizata");
                setModels(aux);
                return;
            }
        }
        System.out.println("Masina nu exista");
    }

    public void add_transaction(String nume){
        Tranzactie T=null;
        for(Client c : clients)
            if(c.getName().equalsIgnoreCase(nume)){
                T=c.add_transaction();
                c.addT(T);
                System.out.println("Tranzactie adaugata\n");
                return;
            }
        System.out.println("Clientul nu exista , urmeaza adaugarea acestuia.");
        Client c=Client.read_client();
        T=c.add_transaction();
        c.addT(T);
        clients.add(c);
        System.out.println("Tranzactie adaugata\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Car> getModels() {
        return models;
    }

    public void setModels(ArrayList<Car> models) {
        this.models = models;
    }

    public SortedSet<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(SortedSet<Employee> employees) {
        this.employees = employees;
    }

    public TreeSet<Client> getClients() {
        return clients;
    }

    public void setClients(TreeSet<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", models=" + models +
                ", employees=" + employees +
                ", clients=" + clients +
                '}';
    }
}
