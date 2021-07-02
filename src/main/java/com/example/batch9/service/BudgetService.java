package com.example.batch9.service;

import com.example.batch9.entity.Budget;
import com.example.batch9.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BudgetService {

    @Autowired(required = true)
    private BudgetRepository budgetRepository;

    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> saveBudgets(List<Budget> budgets) {
        return budgetRepository.saveAllAndFlush(budgets);
    }

    public List<Budget> getBudgets() {
        return budgetRepository.findAll();
    }

    public Budget getBudgetByUpper() {
        return budgetRepository.findAmountUpper();
    }

    public Budget getBudgetByLower() {
        return budgetRepository.findAmountLower();
    }

    public String deleteBudget(int id) {
        budgetRepository.deleteById(id);
        return "Bertobatlah nak";
    }

    public Budget updateBudget(Budget budget) {
        Budget existBudget = budgetRepository.findById(budget.getId()).orElse(null);
        existBudget.setCompany_id(budget.getCompany_id());
        existBudget.setAmount(budget.getAmount());
        return budgetRepository.save(existBudget);
    }

}
