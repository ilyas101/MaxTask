package ru.karimov.palindrome;

import ru.karimov.palindrome.service.GameService;

/**
 * Created by 777 on 02.10.2019.
 */
public class StartApp {
    public  static void main(String[] args) {
        GameService seans = new GameService();
        seans.tryWord("fhf", "1");
        seans.tryWord("fhffhf", "3");
        seans.tryWord("fhfff", "2");
        seans.tryWord("fhf", "4");
        seans.tryWord("fhffhffhf", "1");
        seans.tryWord("uyuyuyuyuyuyuyuyu", "3");
        System.out.println(seans.findLeaders());

    }
}
