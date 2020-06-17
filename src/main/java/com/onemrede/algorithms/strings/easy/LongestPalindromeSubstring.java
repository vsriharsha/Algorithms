package com.onemrede.algorithms.strings.easy;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalidrome("abaxyzzyxf"));
    }
    //input abaxyzzyxf
    //output xyzzyx
    public static String longestPalidrome(String str) {
        int[] currentLongest = {0, 1};
        for (int i=0;i<str.length();i++) {
            int[] odd = getLongestPalindromeFrom(str, i-1, i+1);
            int[] even = getLongestPalindromeFrom(str, i-1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    private static int[] getLongestPalindromeFrom(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if(str.charAt(left) != str.charAt(right)){
                break;
            }
            left--;
            right++;
        }
        return new int[] {left+1, right};
    }
}
