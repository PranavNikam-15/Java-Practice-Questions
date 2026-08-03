// Task: Implement Binary Search on a sorted array.

import java.util.Scanner;

public class task_04 {
    public static int binarySearch(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) 
            {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 16;

        int result = binarySearch(arr, target);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } 
        else {
            System.out.println("Element not found.");
        }
    }
}