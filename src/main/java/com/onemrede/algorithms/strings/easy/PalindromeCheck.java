package com.onemrede.algorithms.strings.easy;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Method 1: " + isPalindrome("abcddcba"));
        System.out.println("Method 2: " + isPalindromeReverseStringMethod("abcddcba"));
    }
    //1. compare extremes and move toward center
    public static boolean isPalindrome(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while(leftIndex < rightIndex) {
            if(str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    //2. comparing with reversed string
    public static boolean isPalindromeReverseStringMethod(String str) {
        String reversedStr = "";
        for(int i=str.length() - 1; i>=0; i--) {
             reversedStr = reversedStr + str.charAt(i);
        }
        return str.equals(reversedStr);
    }
}
