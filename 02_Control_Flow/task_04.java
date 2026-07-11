// Task: Check if three side lengths can form a valid triangle.

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The side lengths can form a valid triangle.");
        } else {
            System.out.println("The side lengths cannot form a valid triangle.");
        }

        scanner.close();
    }
}