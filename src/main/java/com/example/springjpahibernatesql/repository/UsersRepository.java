package com.example.springjpahibernatesql.repository;

import com.example.springjpahibernatesql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Employee, Integer> {
}
