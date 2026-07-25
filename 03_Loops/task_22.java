// Task: Check if a number is a power of 2 using bitwise operations.

import java.util.Scanner;

public class task_22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);

        if(isPowerOfTwo) {
            System.out.println(num + " is a power of 2.");
        } 
        else {
            System.out.println(num + " is not a power of 2.");
        }
        scanner.close();
    }
}