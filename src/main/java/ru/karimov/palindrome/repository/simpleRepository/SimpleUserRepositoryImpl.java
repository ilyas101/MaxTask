package ru.karimov.palindrome.repository.simpleRepository;

import ru.karimov.palindrome.model.User;
import ru.karimov.palindrome.repository.UserRepository;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by 777 on 12.10.2019.
 */
public class SimpleUserRepositoryImpl implements UserRepository {

    private TreeSet<User> users = new TreeSet<>(new UserComparatorByName());

    class UserComparatorByPoints implements Comparator<User> {
        public int compare(User a, User b){
            if(a.getPoins()> b.getPoins())
                return -1;
            else if(a.getPoins()< b.getPoins())
                return 1;
            else
                return 0;
        }
    }

    class UserComparatorByName implements Comparator<User> {
        public int compare(User a, User b){
            return a.getName().compareTo(b.getName());
        }
    }

    @Override
    public User findUserByName(String name) {
        return users.stream().filter(user -> name.equals(user.getName())).findAny().orElse(null);
    }

    @Override
    public TreeSet<User> findLeaders() {
        int i = 0;
        TreeSet currentSet = new TreeSet<>(new UserComparatorByPoints());
        currentSet.addAll(users);
        TreeSet top5Set = new TreeSet<>(new UserComparatorByPoints());
        Iterator<User> it = currentSet.iterator();
        while (it.hasNext() && i < 5) {
            top5Set.add(it.next());
            i++;
        }
        return top5Set;
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
