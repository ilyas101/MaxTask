package ru.karimov.palindrome.service;

import ru.karimov.palindrome.model.User;
import ru.karimov.palindrome.repository.UserRepository;
import ru.karimov.palindrome.util.IPalindromeChecker;

import java.util.*;

/**
 * Created by 777 on 02.10.2019.
 */
public class GameService implements IGameService {
    private IPalindromeChecker palindromeChecker;
    private UserRepository userRepository;

    public GameService(IPalindromeChecker palindromeChecker, UserRepository userRepository) {
        this.palindromeChecker = palindromeChecker;
        this.userRepository = userRepository;
    }

    @Override
    public void tryWord(String word, String nameUser) {
        if (palindromeChecker.isPalindrome(word)) {
            User user = getUser(nameUser);
            if (user == null) {
                user = new User(nameUser);
                saveUser(user);
            }
            addPalindromeToUser(user, word);
        }
    }

    @Override
    public TreeSet<User> findLeaders() {
        return userRepository.findLeaders();
    }

    private void saveUser(User user) {
        userRepository.save(user);
    }

    private User getUser(String name) {
        return userRepository.findUserByName(name);
    }

    private void addPalindromeToUser(User user, String palindrome) {
        if (!user.getPallindromes().contains(palindrome)) {
            user.getPallindromes().add(palindrome);
            user.setPoints(user.getPoints() + palindrome.length());
            saveUser(user);
        }
    }
}
