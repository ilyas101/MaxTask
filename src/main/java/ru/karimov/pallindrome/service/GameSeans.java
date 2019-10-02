package ru.karimov.pallindrome.service;

import ru.karimov.pallindrome.model.User;

import java.util.HashSet;

/**
 * Created by 777 on 02.10.2019.
 */
public class GameSeans {
    private PallindromeChecker pallindromeChecker = new PallindromeChecker();
    private HashSet<User> users = new HashSet<>();

    public void tryWord(String word, String nameUser) {
        if (pallindromeChecker.isPallindrome(word)) {
            User user = getUser(nameUser);
            if (!user.getPallindromes().contains(word)) {
                user.setPoins(user.getPoins() + word.length());
            }
        }
    }

    private User getUser(String name) {
        User user = new User();
        return user;
    }
}
