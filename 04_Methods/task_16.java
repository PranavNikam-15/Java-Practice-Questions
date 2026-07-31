// Task: Write a recursive method to find string length.

import java.util.Scanner;

public class task_19 {

    public static int length(String str) {
        
        if(str.equals("")) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Length of string: " + length(str));
        scanner.close();
    }
}