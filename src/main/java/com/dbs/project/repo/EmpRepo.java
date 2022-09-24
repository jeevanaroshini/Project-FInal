package com.dbs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Employee;

public interface EmpRepo extends JpaRepository<Employee,String> {

	Employee findByUsername(String username);

}
