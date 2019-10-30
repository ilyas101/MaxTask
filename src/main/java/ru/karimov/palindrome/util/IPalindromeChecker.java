package ru.karimov.palindrome.util;

/**
 * Created by ikarimov on 30.10.2019.
 */
public interface IPalindromeChecker {
    /**
     * Checking that word or phrase is palindrome
     * @param word verifiable word or phrase
     * @return true if word or phrase is palindrome and false if vice versa
     */
    boolean isPalindrome(String word);
}
