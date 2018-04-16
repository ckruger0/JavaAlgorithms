package com.ckruger;

/**
 * Shell Sort Algorithm -
 *
 * In place algorithm. Complexity varies on gap - worst case is O(n2) complexity.
 * Usually performs better than insertion sort since less shifting required.
 *
 * Unstable algorithm - Relative ordering of duplicate items is NOT preserved.
 */

public class Main {

    public static void main(String[] args) {

        // Enter integer array to be sorted here
        int[] numbers = {5,72,23,100,-134,-10,33,-4,-300};

        // Shell Sort
        for(int gap = numbers.length/2 ; gap > 0 ; gap /= 2){

            for(int i = gap; i < numbers.length ; i++){
                int newElement = numbers[i];

                int j = i;

                while(j >= gap && numbers[j-gap] > newElement){
                    numbers[j] = numbers[j-gap];
                    j -= gap;
                }

                numbers[j] = newElement;
            }
        }

        // Print sorted array
        for(int num: numbers){
            System.out.println(num);
        }


    }

}
