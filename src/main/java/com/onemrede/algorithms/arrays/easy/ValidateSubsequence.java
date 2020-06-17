package com.onemrede.algorithms.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        //input array=[5,1,22,25,6,-1,8,10] sequence=[1,6,-1,10]
        //output=true
        List<Integer> array = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> sequence = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1);
        System.out.println("Result: " + isValidSubsequence(array,sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int pointer = 0;
        int i = 0;
        while(i < array.size() && pointer < sequence.size()) {
            if(array.get(i).equals(sequence.get(pointer))) {
                pointer++;
            }
            i++;
        }
        return pointer == sequence.size();
    }
}
