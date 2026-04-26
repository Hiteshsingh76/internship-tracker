import java.util.ArrayList;
import java.util.Scanner;

class Application {
    String company;
    String role;
    String status;

    public Application(String company, String role, String status) {
        this.company = company;
        this.role = role;
        this.status = status;
    }

    public void display() {
        System.out.println("Company: " + company + ", Role: " + role + ", Status: " + status);
    }
}

