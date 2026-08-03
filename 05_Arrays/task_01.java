// Task: Find the maximum and minimum elements in a 1D array.

public class task_01 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 2, 67, 34, 89, 5};

        int min = arr[0];
        int max = arr[0];

        for(int i=1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}