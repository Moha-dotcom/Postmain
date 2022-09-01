package com.example.postmain.service;

import com.example.postmain.model.Users;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();
    public Object getUser(int id);

    public int postUsers(Users user);
    public int updateUser(Users user, int id);
    public Object deleteUser(String firstname, int id);

}
