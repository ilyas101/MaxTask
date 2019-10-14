package ru.karimov.pallindrome.service;

/**
 * Created by 777 on 02.10.2019.
 */
public class PallindromeChecker {

    public boolean isPallindrome(String word) {
        String clean = word.replaceAll("\\s","").toLowerCase();
        int n = clean.length();
        for (int i = 0; i < n/2; ++i) {
            if (clean.charAt(i) != clean.charAt(n-i-1)) return false;
        }
        return true;
    }
}
