// Task: Check if a number is positive, negative, or zero.

import java.util.Scanner;

public class task_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        if(num > 0) {
            System.out.println(num + " is Positive.");
        } 
        else if(num < 0) {
            System.out.println(num + " is Negative.");
        } 
        else {
            System.out.println("The number is Zero.");
        }
        
        scanner.close();
    }
}
