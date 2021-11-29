package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.in28minutes.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "Lau", new Date()));
        userList.add(new User(2, "Lino", new Date()));
        userList.add(new User(3, "Sammy", new Date()));
    }

    public User newUser;
    private static int userCount = 3;

    public List<User> findAll() {
        return userList;
    }

    public User save(User user) {
        ///newUser = user;
        if (user.getId() == null) {
            user.setId((++userCount));
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
