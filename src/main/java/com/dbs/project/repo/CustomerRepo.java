package com.dbs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Customers;

public interface CustomerRepo extends JpaRepository <Customers,String>{

	Customers findByUsername(String username);

}
