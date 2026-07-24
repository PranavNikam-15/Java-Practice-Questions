// Task: Convert a decimal number to binary.

import java.util.Scanner;

public class task_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        if(num == 0) {
            System.out.println("Binary: 0");
        } 
        else {
            
            StringBuilder binary = new StringBuilder();
            int temp = Math.abs(num);

            while (temp > 0) {
                binary.insert(0, temp % 2);
                temp /= 2;
            }

            if(num < 0) {
                binary.insert(0, "-");
            } 

            System.out.println("Binary: " + binary);
        }
        scanner.close();
    }
}