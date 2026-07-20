// Task: Find the factorial of a number using a while loop.

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while(i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}