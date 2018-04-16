package com.ckruger;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	    int[] myIntArray = getIntegers(5);

        printArray(myIntArray);
        }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        for (int i=0; i<capacity; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("These items are in the array:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortArray(int [] array){
        int [] sortedArray = new int[array.length];

        int max = Collections.max(Arrays.asList(array));
    }
}
