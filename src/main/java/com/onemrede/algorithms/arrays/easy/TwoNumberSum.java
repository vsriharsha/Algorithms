package com.onemrede.algorithms.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] output = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(output.length);
        if(output.length > 0) {
            System.out.println(output[0] + "," + output[1]);
        }
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Boolean> table = new HashMap<Integer, Boolean>();
        int potentialMatch = 0;
        for (int i=0; i<array.length; i++) {
            potentialMatch = targetSum - array[i];
            if(table.containsKey(potentialMatch)) {
                return new int[] {potentialMatch, array[i]};
            }
            else {
                table.put(array[i], true);
            }
        }
        return new int[0];
    }
}
