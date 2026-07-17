// Task: Check voting and driving eligibility using nested conditions.

import java.util.Scanner;

public class task_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        if(age >= 18) {

            System.out.println("Eligible to vote.");
            System.out.print("Do you have a valid driving license? (true/false): ");

            boolean hasLicense = scanner.nextBoolean();

            if(hasLicense) {
                System.out.println("Eligible to drive.");

            } else {
                System.out.println("Not eligible to drive (License required).");
            }

        } else {
            System.out.println("Not eligible to vote or drive.");
        }
        
        scanner.close();
    }
}