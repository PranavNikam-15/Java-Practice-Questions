// Task: Write a recursive method to find the N-th Fibonacci number.

import java.util.Scanner;

public class task_05 {

    public static long fibonacci(int n) {

        if(n <= 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        System.out.println(n + "-th Fibonacci number: " + fibonacci(n));
        scanner.close();
    }
}