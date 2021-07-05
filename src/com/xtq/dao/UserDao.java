package com.xtq.dao;

import com.xtq.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao {
    public User queryUserByUsernamePassword(@Param("username") String username,@Param("password") String password);

    public List<User> getUser();

    public User queryUserByUsername(@Param("username") String username);

    public int saveUser(@Param("user") User user);

    public void DeleteUser(@Param("user") User user);

    public User FindUser(@Param("id") int userid);
}
