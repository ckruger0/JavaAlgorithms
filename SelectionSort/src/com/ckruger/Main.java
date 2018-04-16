package com.ckruger;

/**
 * Selection Sort Algorithm -
 *
 * Better than bubble sort. In place algorithm. O(n2) complexity.
 * On average, selection sort will perform better than bubble sort since there are
 * less swaps that need to occur.
 *
 * Unstable algorithm - Relative ordering of duplicate items is NOT preserved.
 */

public class Main {

    public static void main(String[] args) {

        // Enter integer array to be sorted here
        int[] numbers = {5,72,23,100,-134,-10,33,-4,-300};

        // Selection Sort
        for(int unsortedIndex = numbers.length - 1 ; unsortedIndex > 0 ; unsortedIndex--) {

            int largestNumber = 0;

            for (int j = 1; j <= unsortedIndex; j++) {
                if (numbers[j] > numbers[largestNumber]) {
                    largestNumber = j;
                }
            }

            swap(numbers, largestNumber, unsortedIndex);

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