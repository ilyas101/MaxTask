package ru.karimov.palindrome.util;

import org.junit.Test;
import ru.karimov.palindrome.util.palindromChecker.PalindromeChecker;

import static org.junit.Assert.*;
/**
 * Created by ikarimov on 30.10.2019.
 */
public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void isPalindrome_validPalindrome_true() throws Exception {
        String testValid = "asd f dsa";
        assertTrue("The phrase must be a palindrome", palindromeChecker.isPalindrome(testValid));
    }

    @Test
    public void isPalindrome_notValidPalindrome_false() throws Exception {
        String testNotValid = "asd f dsa1";
        assertFalse("The phrase should not be a palindrome", palindromeChecker.isPalindrome(testNotValid));
    }
}
