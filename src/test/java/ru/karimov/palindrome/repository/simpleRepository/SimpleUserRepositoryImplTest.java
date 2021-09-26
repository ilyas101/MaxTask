package ru.karimov.palindrome.repository.simpleRepository;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.karimov.palindrome.model.User;
import ru.karimov.palindrome.repository.SimpleUserRepositoryImpl;

import java.util.TreeSet;

import static org.junit.Assert.*;
/**
 * Created by 777 on 30.11.2019.
 */
public class SimpleUserRepositoryImplTest {
    SimpleUserRepositoryImpl sut = new SimpleUserRepositoryImpl();

    @BeforeClass
    public void init() {
        User user1 = new User("Bob");
        user1.setPoints(2);
        User user2 = new User("Bober");
        user2.setPoints(2);
        User user3 = new User("Bobs");
        user3.setPoints(20);
        User user4 = new User("Bobik");
        user4.setPoints(1);
        User user5 = new User("Boba");
        user5.setPoints(9);
        User user6 = new User("Bobat");
        user6.setPoints(19);
        User user7 = new User("Bobak");
        user7.setPoints(15);

        sut.save(user1);
        sut.save(user2);
        sut.save(user3);
        sut.save(user4);
        sut.save(user5);
        sut.save(user6);
        sut.save(user7);
    }

    @Test
    public void shouldFindBobsAsLeader() {
        TreeSet<User> leaderSet = sut.findLeaders();
        assertTrue("Bobs".equals(leaderSet.first().getName()));
    }

    @Test
    public void shouldFindUser() {
        assertNotNull(sut.findUserByName("Bobik"));
    }

    @Test
    public void shouldSaveUser() {
        User userTest = new User("Test");
        userTest.setPoints(0);
        sut.save(userTest);
        assertNotNull(sut.findUserByName("Test"));
    }
}
