// Task: Calculate square and cube using custom methods.

public class task_01 {
    
    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        int val = 4;
        System.out.println("Square of " + val + ": " + square(val));
        System.out.println("Cube of " + val + ": " + cube(val));
    }
}