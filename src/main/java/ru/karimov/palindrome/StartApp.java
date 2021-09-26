package ru.karimov.palindrome;

import ru.karimov.palindrome.repository.UserRepository;
import ru.karimov.palindrome.repository.SimpleUserRepositoryImpl;
import ru.karimov.palindrome.service.GameService;
import ru.karimov.palindrome.util.IPalindromeChecker;
import ru.karimov.palindrome.util.PalindromeChecker;

/**
 * Created by 777 on 02.10.2019.
 */
public class StartApp {
    public  static void main(String[] args) {
        IPalindromeChecker palindromeChecker = new PalindromeChecker();
        UserRepository userRepository = new SimpleUserRepositoryImpl();
        GameService seans = new GameService(palindromeChecker, userRepository);

        seans.tryWord("fhf", "1");
        seans.tryWord("fhffhf", "3");
        seans.tryWord("fhfff", "2");
        seans.tryWord("fhf", "4");
        seans.tryWord("fhffhf", "1");
        seans.tryWord("uyuyuyuyuyuyuyuyu", "3");
        System.out.println(seans.findLeaders());

    }
}
