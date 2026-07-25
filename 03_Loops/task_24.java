// Task: Find the sum of the series: 1 + 2 + 4 + 7 + 11 ... up to N terms.

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N terms: ");
        int n = scanner.nextInt();

        long sum = 0;
        long currentTerm = 1;

        System.out.print("Series: ");

        for (int i=1; i <= n; i++) {

            System.out.print(currentTerm + (i == n ? "" : " + "));
            sum += currentTerm;
            currentTerm += i;
        }

        System.out.println("\nSum of " + n + " terms: " + sum);
        scanner.close();
    }
}