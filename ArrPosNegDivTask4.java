package com.company;

import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class ArrPosNegDivTask4 {
    public static void main(String[] args) {
        int arrSize;
        int [][] divArr;
        Scanner in = new Scanner(System.in);
        System.err.print("Please, input your array length:");
        arrSize = in.nextInt();
        divArr = divPosNegArr(arrSize);
        System.err.println("Your first array:" + Arrays.toString(divArr[0]));
        System.err.println("Your second array:" + Arrays.toString(divArr[1]));
        System.err.println("Your third array:" + Arrays.toString(divArr[2]));
    }
    private static int[][] divPosNegArr(int Length) {

        int[] arr = new int[Length];
        int[] arrPos = copyOf(arr, arr.length);
        int[] arrNeg = copyOf(arr, arr.length);
        int[][] arrayRes = new int[3][];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 19) - 9;
        }
        int posI = 0;
        int negI = 0;
        for(int i : arr) {
            if (i >= 0) {
                arrPos[posI] = i;
                posI++;
            } else {
                arrNeg[negI] = i;
                negI++;
            }
        }
        arrPos = copyOf(arrPos, posI);
        arrNeg = copyOf(arrNeg, negI);

        arrayRes[0] = arr;
        arrayRes[1] = arrPos;
        arrayRes[2] = arrNeg;

        return arrayRes;
    }
}
