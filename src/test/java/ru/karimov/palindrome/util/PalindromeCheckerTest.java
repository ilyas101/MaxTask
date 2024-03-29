package ru.karimov.palindrome.util;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by ikarimov on 30.10.2019.
 */
public class PalindromeCheckerTest {
    PalindromeChecker sut = new PalindromeChecker();

    @Test
    public void shouldVerifyValidPalindrome() throws Exception {
        String testValid = "asd f dsa";
        assertTrue("The phrase must be a palindrome", sut.isPalindrome(testValid));
    }

    @Test
    public void shouldNotVerifyNotValidPalindrome() throws Exception {
        String testNotValid = "asd f dsa1";
        assertFalse("The phrase should not be a palindrome", sut.isPalindrome(testNotValid));
    }
}
