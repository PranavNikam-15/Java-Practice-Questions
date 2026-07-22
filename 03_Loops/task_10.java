// Task: Check if a number is an Armstrong number.

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp = num;
        int digits = String.valueOf(Math.abs(num)).length();
        int sum = 0;
        
        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if(sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } 
        else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scanner.close();
    }
}