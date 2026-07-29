// Task: Write a recursive method to calculate the sum of digits.

import java.util.Scanner;

public class task_10 {

    public static int sumOfDigits(int n) {

        n = Math.abs(n);

        if(n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        System.out.println("Sum of digits: " + sumOfDigits(n));
        scanner.close();
    }
}