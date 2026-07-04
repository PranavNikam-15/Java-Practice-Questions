// Task: Check if a given character is uppercase, lowercase, digit, or special symbol.

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);
        
        if(Character.isUpperCase(ch)) {
            System.out.println(ch + " is an Uppercase letter.");

        } else if(Character.isLowerCase(ch)) {
            System.out.println(ch + " is a Lowercase letter.");

        } else if(Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");

        } else{
            System.out.println(ch + " is a Special Symbol.");
        }

        scanner.close();
    }
}