package com.example.postmain;

import com.example.postmain.dao.UserDao;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PostmainApplication implements CommandLineRunner {


    @Autowired
    UserDao userDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


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

        logger.info("" + userDao.getUsers(8));





    }
}
