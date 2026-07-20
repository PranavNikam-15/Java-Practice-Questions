// Task: Reverse the digits of a given integer.

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();
        int reversed = 0;
        int temp = Math.abs(num);

        while(temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        if(num < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}