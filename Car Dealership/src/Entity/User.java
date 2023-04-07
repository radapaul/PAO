package Entity;

import java.util.Scanner;

public abstract class User {
    private String Name,Email;

    public User(String name, String email) {
        Name = name;
        Email = email;
    }
    public User(){}

    public abstract void read();
    public void read_base_user(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nume : ");
        setName(scanner.nextLine());
        System.out.print("Email : ");
        setEmail(scanner.nextLine());
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}