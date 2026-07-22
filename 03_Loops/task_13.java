// Task: Find the Greatest Common Divisor (GCD / HCF) of two numbers using Euclidean algorithm.

import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int x = a, y = b;
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        System.out.println("GCD/HCF of " + a + " and " + b + " is: " + x);
        scanner.close();
    }
}