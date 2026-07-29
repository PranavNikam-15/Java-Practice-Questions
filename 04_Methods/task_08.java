// Task: Print numbers from N down to 1 recursively.

import java.util.Scanner;

public class task_08 {

    public static void printDescending(int n) {
        if(n <= 0) {
            return;
        }

        System.out.print(n + " ");
        printDescending(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        printDescending(n);
    
        System.out.println();
        scanner.close();
    }
}