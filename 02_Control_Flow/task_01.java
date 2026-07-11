// Task: Validate if a year is a leap year.

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0);

        if (isLeap) {
            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}