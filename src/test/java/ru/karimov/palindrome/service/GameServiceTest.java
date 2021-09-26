package ru.karimov.palindrome.service;

import org.junit.Ignore;
import org.junit.Test;
import ru.karimov.palindrome.repository.SimpleUserRepositoryImpl;
import ru.karimov.palindrome.util.PalindromeChecker;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by ikarimov on 19.12.2019.
 */
public class GameServiceTest {
    GameService sut = new GameService(new PalindromeChecker(), new SimpleUserRepositoryImpl());

    @Test(expected = NoSuchElementException.class)
    public void shouldNoSuchElementExceptionForNewUserWithNotValidPalindrome() {
        sut.tryWord("rqq", "user");
        sut.findLeaders().stream().filter(u -> "user".equals(u.getName())).findAny().get();
    }

    @Test
    public void shouldReturn26pointsForNewUserWithValidPalindrome() {
        sut.tryWord("а роза упала на лапу Азора", "user");
        assertTrue(sut.findLeaders().stream().filter(u -> "user".equals(u.getName())).findAny().get().getPoints() == 26);
    }
}
