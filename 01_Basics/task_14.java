// Task: Perform implicit and explicit type casting.

public class task_14 {
    public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt; 

        System.out.println("Implicit casting (int to double): " + myDouble);
        
        double originalDouble = 9.78;
        int convertedInt = (int) originalDouble;
        
        System.out.println("Explicit casting (double to int): " + convertedInt);
    }
}