package com.onemrede.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {3, 10, 19, 2, 1, 6, 0};
        System.out.println(Arrays.toString(selectionSort(input)));
    }

    private static int[] selectionSort(int[] array) {
        int strtIdx = 0;
        while ( strtIdx < array.length -1) {
            int smallestIdx = strtIdx;
            for(int i = strtIdx + 1; i< array.length; i++) {
                if(array[smallestIdx] > array[i]) {
                    smallestIdx = i;
                }
            }
            swap(strtIdx, smallestIdx, array);
            strtIdx++;
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
