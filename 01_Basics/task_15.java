// Task: Print ASCII value of a character

import java.util.Scanner;

public class task_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);
        
        int ascii = (int) ch;
        System.out.println("The ASCII/Unicode value of " + ch + " is " + ascii);

        scanner.close();
    }
}