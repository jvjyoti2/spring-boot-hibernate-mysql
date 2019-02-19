package com.example.springjpahibernatesql.model;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
public class Employee {


    public Employee(int id, String name, String team_name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.team_name = team_name;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String team_name;
    private int salary;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public int getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
        super();
    }
}
