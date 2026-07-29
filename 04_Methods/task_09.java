// Task: Print numbers from 1 up to N recursively.

import java.util.Scanner;

public class task_09 {

    public static void printAscending(int n) {

        if(n <= 0) {
            return;
        }

        printAscending(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        printAscending(n);
        
        System.out.println();
        scanner.close();
    }
}