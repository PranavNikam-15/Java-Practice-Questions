// Task: Print the first N terms of the Fibonacci sequence.

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        long a = 0, b = 1;

        System.out.print("Fibonacci sequence: ");

        for(int i=1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        scanner.close();
    }
}