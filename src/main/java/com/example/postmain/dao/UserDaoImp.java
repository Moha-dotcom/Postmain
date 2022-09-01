package com.example.postmain.dao;

import com.example.postmain.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Users> getUsers() {

        String sql = "SELECT * FROM USERS";
        //A row mapper is used to match the data coming from the database to the attributes of the bean
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Users>(Users.class));
    }
}
