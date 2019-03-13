package com.company;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ThirdArraySummedTask3 {
    public static void main(String[] args) {
        int arrSize;
        int [][] thirdArr;
        Scanner in = new Scanner(System.in);
        System.err.print("Please, input your array length:");
        arrSize = in.nextInt();
        thirdArr = set3Arr(arrSize);
        System.err.println("Your first array:" + Arrays.toString(thirdArr[0]));
        System.err.println("Your second array:" + Arrays.toString(thirdArr[1]));
        System.err.println("Your third array:" + Arrays.toString(thirdArr[2]));
    }
    private static int[][] set3Arr (int lngth) {

        int[] arr1 = new int[lngth];
        int[] arr2 = copyOf(arr1, arr1.length);
        int[] arr3 = copyOf(arr1, arr1.length);
        int[][] arraySum = new int[3][];

        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 20);
        }
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 20);
        }
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        arraySum[0] = arr1;
        arraySum[1] = arr2;
        arraySum[2] = arr3;
        return arraySum;
    }
}
