// Task: Convert a binary number to decimal.

import java.util.Scanner;

public class task_19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = scanner.nextLong();

        long temp = binary;
        long decimal = 0;
        long base = 1;

        while(temp > 0) {

            long lastDigit = temp % 10;
            decimal += lastDigit * base;
            base *= 2;
            temp /= 10;
        }

        System.out.println("Decimal equivalent of binary " + binary + " is: " + decimal);
        scanner.close();
    }
}