// Task: Write a recursive method to check if a string is a palindrome.

import java.util.Scanner;

public class task_12 {

    public static boolean isPalindrome(String str, int start, int end) {
       
        if(start >= end) {
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        boolean result = isPalindrome(str, 0, str.length() - 1);

        if(result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str +  " is not a palindrome.");
        }

        scanner.close();
    }
}