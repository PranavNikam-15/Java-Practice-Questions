// Task: Find the factorial of a number using a for loop.

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = scanner.nextInt();

        long factorial = 1;
        for(int i=1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}