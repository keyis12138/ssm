package com.xtq.dao;

import com.xtq.entity.User;

public interface UserDao {
    public User queryUserByUsernamePassword(String username, String password);
}
