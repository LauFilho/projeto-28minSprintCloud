package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private List<User> userList = new ArrayList<>();

    public List<User> findAll() {
        return userList;
    }

    public User save(User user) {
        if (user.getId() == null) {

        }
        userList.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }

        }
        return null;
    }

    public User deleteUserById(int id) {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }


}
