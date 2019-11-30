package ru.karimov.palindrome.util;

import org.junit.jupiter.api.Test;
import ru.karimov.palindrome.util.palindromChecker.PalindromeChecker;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by ikarimov on 30.10.2019.
 */
public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void isPalindrome_validPalindrome_true() throws Exception {
        String testValid = "asd f dsa";
        assertTrue(palindromeChecker.isPalindrome(testValid), "The phrase must be a palindrome");
    }

    @Test
    public void isPalindrome_notValidPalindrome_false() throws Exception {
        String testNotValid = "asd f dsa1";
        assertFalse(palindromeChecker.isPalindrome(testNotValid), "The phrase should not be a palindrome");
    }
}
