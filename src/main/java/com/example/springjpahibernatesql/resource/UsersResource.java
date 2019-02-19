package com.example.springjpahibernatesql.resource;

import com.example.springjpahibernatesql.model.Employee;
import com.example.springjpahibernatesql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class UsersResource {

    @Autowired
    UsersRepository userRepo;


    @RequestMapping("/all")
    @ResponseBody
    public List<Employee> getAll()
    {
        return userRepo.findAll();
    }
}
