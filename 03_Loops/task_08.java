// Task: Check if a number is prime (optimized up to sqrt(N)).

import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = num > 1;

        for(int i=2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number (Optimized Check).");
        } 
        else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}