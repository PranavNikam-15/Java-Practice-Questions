// Task: Read user name, age, and city using Scanner.

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        System.out.println("Hello " + name + ", you are " 
            + age + " years old and live in " + city);
            
        scanner.close();
    }
}