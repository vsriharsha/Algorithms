package com.onemrede.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = {5, 3, 9, 1, 6, 5, 2};
        System.out.println(Arrays.toString(quickSort(input)));
    }

    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
        return array;
    }

    private static void quickSort(int[] array, int strtIdx, int endIdx) {
        if(strtIdx >= endIdx) {
            return;
        }
        int pivot = strtIdx;
        int left = strtIdx + 1;
        int right = endIdx;

        while(right >= left) {
            if (array[left] > array[pivot] && array[right] < array[pivot]) {
                swap(left, right, array);
            }
            if (array[left] <= array[pivot]) {
                left++;
            }
            if (array[right] >= array[pivot]) {
                right--;
            }
        }
        swap(pivot, right, array);
        boolean leftSubarrayIsSmaller = right - 1 - strtIdx < endIdx - (right + 1);
        if (leftSubarrayIsSmaller) {
            quickSort(array, strtIdx, right-1);
            quickSort(array,right + 1, endIdx);
        }
        else {
            quickSort(array, right + 1, endIdx);
            quickSort(array, strtIdx, right -1);
        }
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
