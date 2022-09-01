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

    @Override
    public int postUser(Users user) {
        Users user1 = new Users();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setUsername(user.getUsername());
        user1.setEmail(user.getEmail());
        String sql = "INSERT INTO USERS (firstname, lastname, username,email) " +
                "VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update( sql,
                (Object[]) new String[]{user1.getFirstName(), user1.getLastName(), user1.getUsername(), user1.getEmail()
                });



    }



    @Override
    public int updateUser(Users user, int id) {
        String sql = "UPDATE USERS SET  firstname = ?, lastname = ?, username = ? , email = ? WHERE id = ?";

        return jdbcTemplate.update(sql,  user.getFirstName(), user.getLastName(),
                user.getUsername(), user.getEmail(), id );

    }

    @Override
    public Object getUsers(int id) {
        String sql = "SELECT * FROM USERS WHERE id = ?";
//        //A row mapper is used to match the data coming from the database to the attributes of the bean
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(Users.class));
    }


    @Override
    public Object deleteUser(String firstname, int id) {
        String sql =  " DELETE FROM USERS WHERE firstname = ?  and id = ? ";
        return  jdbcTemplate.update(sql, firstname, id);
    }
}
