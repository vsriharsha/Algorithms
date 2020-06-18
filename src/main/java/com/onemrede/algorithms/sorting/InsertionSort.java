package com.onemrede.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] input = {5, 3, 9, 1, 6, 5, 2};
        System.out.println(Arrays.toString(insertionSort(input)));
    }

    public static int[] insertionSort(int[] array) {
        for(int i = 1; i< array.length; i++) {
            int j = i;
            while(j> 0 && array[j]<array[j-1]) {
                swap(j, j-1, array);
                j--;
            }
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
