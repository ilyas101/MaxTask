package ru.karimov.palindrome.palindrome;

import org.junit.Test;
import ru.karimov.palindrome.service.GameService;

import static org.junit.Assert.*;

/**
 * Created by ikarimov on 19.12.2019.
 */
public class GameServiceTest {
    GameService gameService = new GameService();

    @Test
    public void shouldReturnNullForNewUserWithNotValidPalindrome() {
        gameService.tryWord("rqq", "user");
        assertNull(gameService.getUser("user"));
    }

    @Test
    public void shouldReturn3pointsForNewUserWithValidPalindrome() {
        gameService.tryWord("121", "user");
        assertTrue(gameService.getUser("user").getPoins() == 3);
    }
}
