package com.example.postmain.Controller;


import com.example.postmain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserController {

    /*
    It simplifies the use of JDBC and helps to avoid common errors.
    It executes core JDBC workflow, leaving application code to provide SQL and extract results.
     This class executes SQL queries or updates, initiating iteration over ResultSets
      and catching JDBC exceptions and translating them to the generic,
     more informative exception hierarchy defined in the org.springframework.dao package.
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(method = RequestMethod.GET, value = "/getallUsers")
    public List<Users> getUsersAll(){

        String sql = "SELECT * FROM USERS";
        //A row mapper is used to match the data coming from the database to the attributes of the bean
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Users>(Users.class));

    }


    @PostMapping("/postusers")
    public int postUsers (@RequestBody Users user){
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

    @RequestMapping(method = RequestMethod.GET, value = "/getUsers/{id}")
    public Object getUsers(@PathVariable int id){

        String sql = "SELECT * FROM USERS WHERE id = ?";
        //A row mapper is used to match the data coming from the database to the attributes of the bean
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(Users.class));
    }

}

