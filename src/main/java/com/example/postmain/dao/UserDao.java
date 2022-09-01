package com.example.postmain.dao;

import com.example.postmain.model.Users;

import java.util.List;

public interface UserDao {

    public List<Users> getUsers();
    public Object getUsers(int id);


    public int postUser(Users user);


    public int updateUser(Users user, int id);

    public Object deleteUser(String firstname, int id);

}
