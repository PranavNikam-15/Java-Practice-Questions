// Task: Write a recursive method to reverse a string.

import java.util.Scanner;

public class task_11 {
    
    public static String reverse(String str) {

        if(str == null || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Reversed string: " + reverse(str));
        
        scanner.close();
    }
}