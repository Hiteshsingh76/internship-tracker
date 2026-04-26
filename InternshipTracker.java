import java.util.ArrayList;
import java.util.Scanner;

public class InternshipTracker {
    public static void main(String[] args) {
        ArrayList<Application> applications = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Internship Tracker ---");
            System.out.println("1. Add Application");
            System.out.println("2. View Applications");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter company name: ");
                String company = scanner.nextLine();

                System.out.print("Enter role: ");
                String role = scanner.nextLine();

                System.out.print("Enter status (Applied/Interview/Rejected): ");
                String status = scanner.nextLine();

                Application app = new Application(company, role, status);
                applications.add(app);

                System.out.println("Application added!");

            } else if (choice == 2) {
                if (applications.isEmpty()) {
                    System.out.println("No applications found.");
                } else {
                    System.out.println("\nYour Applications:");
                    for (Application app : applications) {
                        app.display();
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
