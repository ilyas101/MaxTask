package ru.karimov.palindrome.repository.simpleRepository;

import org.junit.Before;
import org.junit.Test;
import ru.karimov.palindrome.model.User;
import java.util.TreeSet;

import static org.junit.Assert.*;
/**
 * Created by 777 on 30.11.2019.
 */
public class SimpleUserRepositoryImplTest {
    SimpleUserRepositoryImpl simpleUserRepository = new SimpleUserRepositoryImpl();

    @Before
    public void init() {
        User user1 = new User("Bob");
        user1.setPoins(2);
        User user2 = new User("Bober");
        user2.setPoins(2);
        User user3 = new User("Bobs");
        user3.setPoins(10);
        User user4 = new User("Bobik");
        user4.setPoins(1);
        User user5 = new User("Boba");
        user5.setPoins(9);

        simpleUserRepository.save(user1);
        simpleUserRepository.save(user2);
        simpleUserRepository.save(user3);
        simpleUserRepository.save(user4);
        simpleUserRepository.save(user5);
    }

    @Test
    public void shouldFindBobAsLeader() {
        TreeSet<User> leaderSet = simpleUserRepository.findLeaders();
        assertTrue("Bobs".equals(leaderSet.first().getName()));
    }

    @Test
    public void shouldFindUser() {
        assertNotNull(simpleUserRepository.findUserByName("Bobik"));
    }

    @Test
    public void shouldSaveUser() {
        User userTest = new User("Test");
        userTest.setPoins(0);
        simpleUserRepository.save(userTest);
        assertNotNull(simpleUserRepository.findUserByName("Test"));
    }
}
