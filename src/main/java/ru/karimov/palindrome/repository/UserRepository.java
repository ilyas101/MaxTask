package ru.karimov.palindrome.repository;

import ru.karimov.palindrome.model.User;

import java.util.TreeSet;

/**
 * Created by 777 on 12.10.2019.
 */
public interface UserRepository {

    /**
     * Возвращает юзера по его id
     * @param id - id юзера
     * @return - найденный юзер
     */
    User findUserByName(String name);

    /**
     * сохраняет юзера
     * @param user - юзер, кот. необходимо сохранить
     */
    void save(User user);

    /**
     * Поиск топ-5 лидеров игры
     * @return - лидеры игры
     */
    TreeSet<User> findLeaders();
}
