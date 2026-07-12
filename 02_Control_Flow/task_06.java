// Task: Check coordinate point quadrant (x, y) position.

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();

        if(x > 0 && y > 0) {
            System.out.println("Point (" + x + ", " + y + ") lies in Quadrant I.");
        } 
        else if(x < 0 && y > 0) {
            System.out.println("Point (" + x + ", " + y + ") lies in Quadrant II.");
        } 
        else if(x < 0 && y < 0) {
            System.out.println("Point (" + x + ", " + y + ") lies in Quadrant III.");
        } 
        else if(x > 0 && y < 0) {
            System.out.println("Point (" + x + ", " + y + ") lies in Quadrant IV.");
        } 
        else if(x == 0 && y == 0) {
            System.out.println("Point is at the Origin.");
        } 
        else if(x == 0) {
            System.out.println("Point lies on the Y-axis.");
        } 
        else {
            System.out.println("Point lies on the X-axis.");
        }
        scanner.close();
    }
}