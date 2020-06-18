package com.onemrede.algorithms.strings.easy;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "cat", "oy", "olfp"));
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
        for (String word: words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            }
            else {
                anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
            }
        }
        return new ArrayList<List<String>>(anagrams.values());
    }
}
