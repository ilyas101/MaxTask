package ru.karimov.palindrome.service;

import ru.karimov.palindrome.model.User;

import java.util.TreeSet;

public interface IGameService {

    /**
     * Принимает на вход слово или фразу и проверяет являюется ли слово/фраза палиндромом. Если является, то юзеры начисляются
     * очки в зависимости от длины фразы/слова (+1 за каждый символ)
     * @param word - слово или фраза, предложенные юзером
     * @param nameUser - имя юзера, кот. предлагает слово для проверки
     */
    void tryWord(String word, String nameUser);

    /**
     * Возвращает Топ-5 юзеров с наибольшим количеством очков
     * @return
     */
    TreeSet<User> findLeaders();
}
