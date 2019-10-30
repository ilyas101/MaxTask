package ru.karimov.palindrome.repository;

import ru.karimov.palindrome.model.User;

import java.util.TreeSet;

/**
 * Created by 777 on 12.10.2019.
 */
public interface UserRepository {

    /**
     * Retrieve an User from the data store by id.
     * @param id the id to search for
     * @return the User if found
     */
    User findUserByName(String name);

    /**
     * Save an User to the data store, either inserting or updating it.
     * @param user the User to save
     */
    void save(User user);

    /**
     * Find top5 games leaders
     * @return games leaders
     */
    TreeSet<User> findLeaders();
}
