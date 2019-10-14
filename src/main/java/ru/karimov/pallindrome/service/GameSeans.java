package ru.karimov.pallindrome.service;

import ru.karimov.pallindrome.model.User;
import ru.karimov.pallindrome.repository.UserRepository;
import ru.karimov.pallindrome.repository.simpleRepository.SimpleUserRepositoryImpl;

import java.util.*;

/**
 * Created by 777 on 02.10.2019.
 */
public class GameSeans {
    private PallindromeChecker pallindromeChecker = new PallindromeChecker();
    private UserRepository userRepository = new SimpleUserRepositoryImpl();

    public void tryWord(String word, String nameUser) {
        if (pallindromeChecker.isPallindrome(word)) {
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
