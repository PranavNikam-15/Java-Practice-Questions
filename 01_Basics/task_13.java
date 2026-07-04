// Task: Find the maximum of three numbers using nested ternary.

public class task_13 {
    public static void main(String[] args) {

        int a = 12, b = 45, c = 25;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Max is " + max);
    }
}