package com.example.postmain.dao;

import com.example.postmain.model.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface UserDao  {



    public List<Users> getUsers();
    public Object getUsers(int id);


    public int postUser(Users user);


    public int updateUser(Users user, int id);

    public Object deleteUser(int id);

}
