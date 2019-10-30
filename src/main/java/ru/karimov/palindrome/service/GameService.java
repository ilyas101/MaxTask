package ru.karimov.palindrome.service;

import ru.karimov.palindrome.model.User;
import ru.karimov.palindrome.repository.UserRepository;
import ru.karimov.palindrome.repository.simpleRepository.SimpleUserRepositoryImpl;
import ru.karimov.palindrome.util.IPalindromeChecker;
import ru.karimov.palindrome.util.palindromChecker.PalindromeChecker;

import java.util.*;

/**
 * Created by 777 on 02.10.2019.
 */
public class GameService {
    private IPalindromeChecker palindromeChecker = new PalindromeChecker();
    private UserRepository userRepository = new SimpleUserRepositoryImpl();

    public void tryWord(String word, String nameUser) {
        if (palindromeChecker.isPalindrome(word)) {
            User user = getUser(nameUser);
            if (user == null) {
                user = new User(nameUser);
                saveUser(user);
            }
            if (!user.getPallindromes().contains(word)) {
                user.getPallindromes().add(word);
                user.setPoins(user.getPoins() + word.length());
                saveUser(user);
            }
        }
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String name) {
        return userRepository.findUserByName(name);
    }

    public TreeSet<User> findLeaders() {
        return userRepository.findLeaders();
    }
}
