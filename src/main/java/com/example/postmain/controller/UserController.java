package com.example.postmain.controller;


import com.example.postmain.model.Users;
import com.example.postmain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    /**
     * getUsersAll method returns a List of Users
     * @return List of Users
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    /**
     * getUser returns a single user from the database using an id as Param
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public Object getUser(@PathVariable int id){
        return userService.getUser(id);
    }
    @PostMapping("/users")
    public int postusers(@RequestBody Users users){
        return userService.postUsers(users);
    }
    @PutMapping("/users/{id}")
    public int updateUser(@RequestBody Users user, @PathVariable int id ){
        return userService.updateUser(user, id);
    }
    @DeleteMapping("/users/{id}")
    public Object deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

}

