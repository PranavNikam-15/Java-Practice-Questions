// Task: Initialize, input, and print a 2D matrix (N x M).

import java.util.Scanner;

public class task_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows N: ");
        int n = scanner.nextInt();

        System.out.print("Enter cols M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter elements:");
        
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix : ");

        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}