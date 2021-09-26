package ru.karimov.palindrome.util;

/**
 * Created by ikarimov on 30.10.2019.
 */
public interface IPalindromeChecker {
    /**
     * Проверка, что слово или фраза являются палиндромом
     * @param word - проверяемое слово или фраза
     * @return true, если слово или фраза это палиндром и false, если нет
     */
    boolean isPalindrome(String word);
}
