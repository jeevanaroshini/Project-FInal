package com.dbs.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions,Integer> {

	List<Transactions> findByCusId(String username);

}
