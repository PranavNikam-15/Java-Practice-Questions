// Task: Convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        scanner.close();
    }
}