package ru.karimov.pallindrome.repository.simpleRepository;

import ru.karimov.pallindrome.model.User;
import ru.karimov.pallindrome.repository.UserRepository;

import java.util.*;

/**
 * Created by 777 on 12.10.2019.
 */
public class SimpleUserRepositoryImpl implements UserRepository {

    private TreeSet<User> users = new TreeSet<>(new UserComparator2());

    class UserComparator implements Comparator<User> {
        public int compare(User a, User b){
            if(a.getPoins()> b.getPoins())
                return -1;
            else if(a.getPoins()< b.getPoins())
                return 1;
            else
                return 0;
        }
    }

    class UserComparator2 implements Comparator<User> {
        public int compare(User a, User b){
            return a.getName().compareTo(b.getName());
        }
    }

    @Override
    public User findUserByName(String name) {
        for (User user : users) {
            if (name.equals(user.getName()))
                return user;
        }
        return null;
    }

    @Override
    public TreeSet<User> findLeaders() {
        Iterator<User> it = users.iterator();
        int i = 0;
        TreeSet<User> current = new TreeSet<>(new UserComparator());
        while (it.hasNext() && i < 5) {
            current.add(it.next());
            i++;
        }
        return current;
    }

    @Override
    public void save(User user) {
        if (users.contains(user)) {
            users.remove(user);
            users.add(user);
        }
        users.add(user);
    }
}
