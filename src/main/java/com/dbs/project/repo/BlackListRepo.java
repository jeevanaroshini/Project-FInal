package com.dbs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Blacklist;


public interface BlackListRepo extends JpaRepository <Blacklist,String>{

	Blacklist findByUsername(String username);

	
}
