// Task: Find all factors of a given number.

import java.util.Scanner;

public class task_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Divisors of " + num + ": ");

        for(int i=1; i <= Math.abs(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}