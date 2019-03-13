package com.company;

import java.util.Scanner;

public class ReverseArrayTask1 {

    public static void main(String[] args) {
        int arrSize; int[] arr;

        System.err.print("Please, input your array length: ");
        Scanner in = new Scanner(System.in);
        arrSize = in.nextInt();
        arr = setArray(arrSize);

        System.err.print("Your array: ");
        for(int i : arr) {
            System.out.print(i + "  ");
        }

        System.err.print("\nYour reverse array: ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }

    }

    private static int[] setArray (int lngth) {
        int[] arr = new int[lngth];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        return arr;
    }


}

