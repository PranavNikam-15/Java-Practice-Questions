// Task: Check if a number is a Strong Number.

import java.util.Scanner;

public class task_17 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if(num > 0 && sum == num) {
            System.out.println(num + " is a Strong Number.");
        } 
        else {
            System.out.println(num + " is not a Strong Number.");
        }
        scanner.close();
    }
}