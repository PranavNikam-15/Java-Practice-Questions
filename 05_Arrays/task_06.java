// Task: Rotate an array left by 1 position.

import java.util.Arrays;

public class task_06 {
    public static void rotateLeftByOne(int[] arr) {

        if(arr.length <= 1) return;
        int first = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateLeftByOne(arr);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}