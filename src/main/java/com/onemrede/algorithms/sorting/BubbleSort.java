package com.onemrede.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        System.out.println(Arrays.toString(bubbleSort(input)));
    }
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        while(!isSorted) {
            isSorted = true;
            for(int i=0; i< array.length - 1 - counter ; i++) {
                if(array[i] > array[i+1]) {
                    swap(i, i+1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
