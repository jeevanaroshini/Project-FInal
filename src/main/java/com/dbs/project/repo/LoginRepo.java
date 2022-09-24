package com.dbs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Customers;
import com.dbs.project.model.Login;

public interface LoginRepo extends JpaRepository<Login, String> {

		Login findByUsername(String username);

}
