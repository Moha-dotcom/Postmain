package com.example.postmain.service;

import com.example.postmain.dao.UserDao;
import com.example.postmain.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{


   @Autowired
    UserDao userDao;


    @Override
    public List<Users> getAllUsers() {

//        String sql = "SELECT * FROM USERS";
//        //A row mapper is used to match the data coming from the database to the attributes of the bean
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Users>(Users.class));

        return userDao.getUsers();

    }

    @Override
    public int postUsers(Users user) {
       return  userDao.postUser(user);
    }

    @Override
    public int updateUser(Users user, int id) {
        return userDao.updateUser(user, id);
    }

    @Override
    public Object getUser(int id) {
        return userDao.getUsers(id);
    }

    @Override
    public Object deleteUser(int id) {
        return userDao.deleteUser(id);
    }
}
