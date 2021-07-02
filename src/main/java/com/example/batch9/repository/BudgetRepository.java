package com.example.batch9.repository;

import com.example.batch9.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Integer> {
    @Query(value = "SELECT * FROM company_budget WHERE amount > 5000000", nativeQuery = true)
    Budget findAmountUpper();

    @Query(value = "SELECT * FROM company_budget WHERE amount < 0", nativeQuery = true)
    Budget findAmountLower();
}
