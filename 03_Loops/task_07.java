// Task: Check if a number is prime (basic trial division).

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = num > 1;

        for(int i=2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } 
        else {
            System.out.println(num + " is not a prime number.");
        }
        scanner.close();
    }
}