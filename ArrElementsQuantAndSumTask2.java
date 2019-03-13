package com.company;

import java.util.Scanner;

public class ArrElementsQuantAndSumTask2 {
    public static void main(String[] args) {
        int arrSize; int[] arr;

        System.err.print("Please, input your array length: ");
        Scanner in = new Scanner(System.in);
        arrSize = in.nextInt();
        arr = setArray(arrSize);

        System.err.print("Your array: ");
        int quant = 0;
        int sum = 0;
        for(int i : arr) {
            System.err.print(i + "  ");
            if (i % 2 != 0) {
                quant++;
                sum = sum + i;
            }
        }
        System.err.println("\nQuantity = " + quant);
        System.err.println("Sum = " + sum);
    }
    private static int[] setArray (int lngth) {
        int[] arr = new int[lngth];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        return arr;
    }

}
