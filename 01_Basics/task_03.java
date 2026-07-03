// Task: Swap two numbers using a third temporary variable.

public class task_03 {
    public static void main(String[] args) {
        
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}