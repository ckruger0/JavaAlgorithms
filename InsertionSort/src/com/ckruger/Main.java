package com.ckruger;

/**
 * Insertion Sort Algorithm -
 *
 * Not efficient. In place algorithm. O(n2) complexity. Can result in a lot of steps.
 * Takes each element and shifts it (not swapping) to the correct position in the sorted partition.
 *
 * Stable algorithm - Relative ordering of duplicate items is preserved.
 */

public class Main {

    public static void main(String[] args) {

        // Enter integer array to be sorted here
        int[] numbers = {5,72,23,100,-134,-10,33,-4,-300};

        // Insertion Sort
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++){
            int newElement = numbers[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex ; i > 0 && numbers[i-1] > newElement; i--){
                numbers[i] = numbers [i-1];
            }

            numbers[i] = newElement;
        }

        // Print sorted array
        for(int num: numbers){
            System.out.println(num);
        }


    }

}
