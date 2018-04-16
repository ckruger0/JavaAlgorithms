package com.ckruger;

/**
 * Bubble Sort Algorithm -
 *
 * Not efficient. In place algorithm. O(n2) complexity.
 * This implementation is slightly optimized since it keeps track of the
 * sorted v. unsorted partitions instead of strictly traversing the entire array.
 *
 * Stable algorithm - Relative ordering of duplicate items is preserved since swaps only
 * occur when a value is greater than the following value, not greater OR equal.
 */

public class Main {

    public static void main(String[] args) {

        // Enter integer array to be sorted here
        int[] numbers = {5,72,23,100,-134,-10,33,-4,-300};

        // Bubble Sort
        for(int unsortedIndex = numbers.length - 1 ; unsortedIndex > 0 ; unsortedIndex--){
            for(int j = 0 ; j < unsortedIndex ; j++){
                if(numbers[j] > numbers[j+1]){
                    swap(numbers, j, j+1);
                }

            }
        }

        // Print sorted array
        for(int num: numbers){
            System.out.println(num);
        }


    }

    // Simple array index-based swap method
    private static void swap(int[] arr, int i, int j){
        if (i == j){
            return;
        }

        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
