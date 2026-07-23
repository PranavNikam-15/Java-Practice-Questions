// Task: Find the Least Common Multiple (LCM) of two numbers using their GCD.

import java.util.Scanner;

public class task_14 {
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

        int gcd = x;
        long lcm = (long) Math.abs(a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        scanner.close();
    }
}