package com.Array;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35}; 
        int key = 25; 
        int result = binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found.");
        }
    }

    public static int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }
}
