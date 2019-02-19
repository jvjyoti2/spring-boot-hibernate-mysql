package com.example.springjpahibernatesql.service;

import com.example.springjpahibernatesql.model.Employee;
import com.example.springjpahibernatesql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class EmployeeService {
    @Autowired
    private UsersRepository rp;

    public EmployeeService(UsersRepository rp) {
        this.rp = rp;
    }
    @PostConstruct
    public void loadData()
    {
        Employee e = new Employee();
        e.setId(2);
        e.setName("Jyo");
        e.setSalary(12000);
        e.setTeam_name("Cms");
        rp.save(e);
    }
}
