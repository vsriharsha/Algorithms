package com.onemrede.algorithms.strings.easy;

public class CaesarCipherExtractor {
    public static void main(String[] args) {
        System.out.println(caesarCipherExtractor("xyz", 2));
    }

    public static String caesarCipherExtractor(String str, int key) {
        char[] newLetters = new char[str.length()];
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<str.length(); i++) {
            newLetters[i] = getNewLetter(str.charAt(i), newKey, alphabet);
        }
        return new String(newLetters);
    }

    private static char getNewLetter(char letter, int key, String alphabet) {
        int newLetterCode = alphabet.indexOf(letter) + key;
        return newLetterCode <= 25 ? alphabet.charAt(newLetterCode) : alphabet.charAt(-1 + newLetterCode % 25);
    }
}
