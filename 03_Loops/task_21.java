// Task: Count the total number of set bits (1s) in the binary representation of an integer.

import java.util.Scanner;

public class task_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int count = 0;
        int temp = num;

        while(temp != 0) {
            count += (temp & 1);
            temp >>>= 1;
        }

        System.out.println("Set bits in " + num + ": " + count);
        scanner.close();
    }
}