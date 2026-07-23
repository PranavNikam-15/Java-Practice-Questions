// Task: Check if a number is a Perfect Number (sum of proper divisors equals the number).

import java.util.Scanner;

public class task_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int sum = 0;

        for(int i=1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if(num > 0 && sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } 
        else {
            System.out.println(num + " is not a Perfect Number.");
        }
        scanner.close();
    }
}