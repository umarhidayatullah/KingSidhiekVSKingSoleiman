package com.example.batch9.repository;

import com.example.batch9.entity.Transaction;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Query(value = "SELECT * FROM transaction WHERE transaction.type = 'R'", nativeQuery = true)
    Transaction findByTypeR();

    @Query(value = "SELECT * FROM transaction WHERE transaction.type = 'S'", nativeQuery = true)
    Transaction findByTypeS();
}
