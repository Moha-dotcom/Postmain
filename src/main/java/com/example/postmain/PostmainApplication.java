package com.example.postmain;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PostmainApplication implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public static void main(String[] args) {
        SpringApplication.run(PostmainApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
//        jdbcTemplate.execute("CREATE TABLE USERS(\n" +
//                "    id int AUTO_INCREMENT NOT NULL primary key,\n" +
//                "    firstname varchar(50), \n" +
//                "    lastname varchar(50), \n" +
//                "    username varchar(20),\n" +
//                "    email varchar(100)\n" +
//                ")");





    }
}
