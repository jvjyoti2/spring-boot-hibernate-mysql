package com.example.springjpahibernatesql;

import com.example.springjpahibernatesql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringJpaHibernateSqlApplication {

    @Autowired
    private UsersRepository rp;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHibernateSqlApplication.class, args);
    }

}
