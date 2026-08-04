// Task: Move all zeros to the end of an array.

import java.util.Arrays;

public class task_08 {
    public static void moveZeros(int[] arr) {

        int insertPos = 0;

        for(int i=0; i < arr.length; i++) {

            if(arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        while(insertPos < arr.length) 
        {
            arr[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}