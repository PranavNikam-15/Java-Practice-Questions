// Task: Use variable arguments (int...) to calculate the sum of numbers.

public class task_18 {

    public static int sum(int... numbers) {

        int total = 0;
        for(int num : numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40, 50: " + sum(10, 20, 30, 40, 50));
        System.out.println("Sum of no numbers: " + sum());
    }
}