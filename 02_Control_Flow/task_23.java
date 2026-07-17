// Task: Implement an ATM PIN verification loop with max 3 attempts.

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        boolean authenticated = false;

        while(attempts < 3) {

            System.out.print("Enter 4-digit PIN: ");
            int pin = scanner.nextInt();
            attempts++;

            if(pin == CORRECT_PIN) {
                authenticated = true;
                break;
                
            } else {
                System.out.println("Incorrect PIN. Attempts remaining: " + (3 - attempts));
            }
        }

        if(authenticated) {
            System.out.println("Access Granted! Welcome to your account.");
        }
        else {
            System.out.println("Account blocked due to 3 failed attempts.");
        }

        scanner.close();
    }
}