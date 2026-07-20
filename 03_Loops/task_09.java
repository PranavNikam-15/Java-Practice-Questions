// Task: Print all prime numbers between 1 and N (Sieve of Eratosthenes introduction).

import java.util.Scanner;
import java.util.Arrays;

public class task_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        if(n >= 2) {

            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);

            isPrime[0] = false;
            isPrime[1] = false;

            for(int p=2; p * p <= n; p++) {
                
                if(isPrime[p]) {
                    for(int i = p * p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            System.out.print("Prime numbers up to " + n + ": ");
            
            for(int i=2; i <= n; i++) {
                if(isPrime[i]) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();

        } 
        else {
            System.out.println("No prime numbers in range.");
        }
        scanner.close();
    }
}