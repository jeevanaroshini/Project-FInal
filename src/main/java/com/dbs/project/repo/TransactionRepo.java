package com.dbs.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, String> {

}
