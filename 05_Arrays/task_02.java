// Task: Calculate the sum and average of array elements.

public class task_02 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        double aveg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}