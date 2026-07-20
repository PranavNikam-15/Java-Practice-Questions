// Task: Check if a number is a palindrome number.

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;
        int temp = Math.abs(num);

        while(temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        if(original >= 0 && original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } 
        else {
            System.out.println(original + " is not a Palindrome number.");
        }
        scanner.close();
    }
}