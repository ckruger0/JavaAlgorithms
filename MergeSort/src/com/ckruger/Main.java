package com.ckruger;

/**
 * Merge Sort Algorithm -
 *
 * O(nlogn) complexity.
 *
 * Divide and conquer algorithm. Recursively splits array into left and right hand side.
 * After splitting to 1-element arrays, we merge back by comparing first elements from left and right.
 *
 * Not in place. Uses temporary arrays so keep in mind if not a lot of memory is available.
 * Stable algorithm that maintains relative order of array elements.
 */

public class Main {

    public static void main(String[] args) {

        // Enter integer array to be sorted here
        int[] numbers = {5,72,23,100,-134,-10,33,-4,-300};

        // Merge Sort
        mergeSort(numbers,0, numbers.length);

        // Print sorted array
        for(int num: numbers){
            System.out.println(num);
        }


    }

    private static void mergeSort(int[] input, int start, int end){

        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end){
        if(input[mid-1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i<mid && j<end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}