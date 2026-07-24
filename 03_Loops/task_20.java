// Task: Find the power of a number (x^y) using a loop without cmath.

import java.util.Scanner;

public class task_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent (y): ");
        int exp = scanner.nextInt();

        double result = 1.0;
        for(int i=1; i <= Math.abs(exp); i++) {
            result *= base;
        }

        if(exp < 0) {
            result = 1.0 / result;
        } 

        System.out.println(base + "^" + exp + " = " + result);
        scanner.close();
    }
}