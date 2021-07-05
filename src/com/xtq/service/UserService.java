package com.xtq.service;

import com.xtq.entity.User;

public interface UserService {
    public User login(String username,String password);

    public void saveUser(User user);

    public void deleteUser(User user);

    public User findUser(int userid);
}
