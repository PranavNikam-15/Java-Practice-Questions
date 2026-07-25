// Task: Implement a digital root calculator (repeatedly sum digits until a single digit remains).

import java.util.Scanner;

public class task_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(scanner.nextInt());

        int temp = num;

        while(temp >= 10) {
            
            int sum = 0;
            while(temp > 0) {

                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
        }

        System.out.println("Digital root of " + num + " is: " + temp);
        scanner.close();
    }
}