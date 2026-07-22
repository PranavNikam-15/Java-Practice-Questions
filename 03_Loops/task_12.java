// Task: Find the product of digits of a number.

import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(scanner.nextInt());
        int product = (num == 0) ? 0 : 1;

        while(num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        System.out.println("Product of digits: " + product);
        scanner.close();
    }
}