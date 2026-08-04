// Task: Find the missing number in an array from 1 to N.

public class task_09 {
    public static int findMissingNumber(int[] arr, int n) {

        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for(int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 4, 5, 6};
        
        System.out.println("Missing number is: " + findMissingNumber(arr, n));
    }
}