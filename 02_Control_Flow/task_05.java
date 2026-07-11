// Task: Determine triangle type (Equilateral, Isosceles, Scalene).

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        if(a + b > c && a + c > b && b + c > a) {

            if(a == b && b == c) {
                System.out.println("Triangle Type: Equilateral");    
            } 
            else if(a == b || b == c || a == c) {
                System.out.println("Triangle Type: Isosceles");
            } 
            else {
                System.out.println("Triangle Type: Scalene");
            }

        } else {
            System.out.println("Not a valid triangle.");
        }
        scanner.close();
    }
}