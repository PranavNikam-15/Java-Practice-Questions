// Task: Find the N-th Fibonacci number iteratively.

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        if(n <= 0) {
            System.out.println("N must be positive.");
        }
        else if (n == 1) {
            System.out.println("1st Fibonacci number is: 0");
        }
        else {
            
            long a = 0, b = 1;
            for(int i=2; i <= n; i++) {
                long next = a + b;
                a = b;
                b = next;
            }

            System.out.println(n + "-th Fibonacci number is: " + a);
        }
        scanner.close();
    }
}