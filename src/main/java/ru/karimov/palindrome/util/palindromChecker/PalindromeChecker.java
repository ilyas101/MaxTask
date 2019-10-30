package ru.karimov.palindrome.util.palindromChecker;

import ru.karimov.palindrome.util.IPalindromeChecker;

/**
 * Created by 777 on 02.10.2019.
 */
public class PalindromeChecker implements IPalindromeChecker{

    @Override
    public boolean isPalindrome(String word) {
        String clean = word.replaceAll("\\s","").toLowerCase();
        int n = clean.length();
        for (int i = 0; i < n/2; ++i) {
            if (clean.charAt(i) != clean.charAt(n-i-1)) return false;
        }
        return true;
    }
}
