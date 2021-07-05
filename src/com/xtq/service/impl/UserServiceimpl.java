package com.xtq.service.impl;

import com.xtq.dao.UserDao;
import com.xtq.entity.User;
import com.xtq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service

public class UserServiceimpl implements UserService {
   @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password) {
        return userDao.queryUserByUsernamePassword(username,password);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.DeleteUser(user);
    }

    @Override
    public User findUser(int userid) {
        return userDao.FindUser(userid);
    }
}
