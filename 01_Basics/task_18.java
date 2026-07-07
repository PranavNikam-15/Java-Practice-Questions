// Task: Extract the last digit of an integer using modulo.

import java.util.Scanner;

public class task_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();
        
        int lastDigit = Math.abs(num % 10);

        System.out.println("The last digit is: " + lastDigit);
        scanner.close();
    }
}