// Task: Check if a character is a vowel or consonant using switch.

import java.util.Scanner;

public class task_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");

        char ch = Character.toLowerCase(scanner.next().charAt(0));
        
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if(Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println("Invalid input. Not a letter.");
                }
        }
        scanner.close();
    }
}