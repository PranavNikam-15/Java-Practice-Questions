// Task: Write a recursive method to calculate x^n efficiently.

import java.util.Scanner;

public class task_06 {

    public static double power(double x, int n) {

        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 1.0 / power(x, -n);
        }

        double half = power(x, n / 2);

        if(n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter exponent n: ");
        int n = scanner.nextInt();
        
        System.out.println(x + "^" + n + " = " + power(x, n));
        scanner.close();
    }
}