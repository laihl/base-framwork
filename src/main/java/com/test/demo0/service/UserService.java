package com.test.demo0.service;

import com.test.demo0.Dao.UserDao;
import com.test.demo0.EntityBeans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findByUserName(String name){
        return userDao.findUserByName(name);
    }

    public User addUserByName(String name){
        User user = new User();
        user.setName(name);

        return userDao.save(user);
    }

}
