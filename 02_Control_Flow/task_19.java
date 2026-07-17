// Task: Implement a menu-driven program using a do-while loop.

import java.util.Scanner;

public class task_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Greet");
            System.out.println("2. Display Date Concept");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello, welcome!");
                    break;

                case 2:
                    System.out.println("Module 2: Control Flow");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
        scanner.close();
    }
}