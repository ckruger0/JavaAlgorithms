package com.ckruger;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

    public static int recursiveFactorial(int i){

        if (i ==0){
            return 1;
        }

        return i * recursiveFactorial(i - 1);
    }

    private static int factorial(int i){
        int holder = 1;

        for (int j = 1; j<=i ; j++){
                holder *= j;
        }

        return holder;
    }
}
