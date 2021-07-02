package com.example.batch9.controller;

import com.example.batch9.entity.Budget;
import com.example.batch9.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/addBudget")
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetService.saveBudget(budget);
    }

    @PostMapping("/addBudgets")
    public List<Budget> addBudgets(@RequestBody List<Budget> budgets) {
        return budgetService.saveBudgets(budgets);
    }

    @GetMapping("/getBudgets")
    public List<Budget> getBudgets() {
        return budgetService.getBudgets();
    }

    @GetMapping("/getBudgetByUpper")
    public Budget findByUpper() {
        return budgetService.getBudgetByUpper();
    }

    @GetMapping("/getBudgetByLower")
    public Budget findByLower() {
        return budgetService.getBudgetByLower();
    }

    @DeleteMapping("/deleteBudget/{id}")
    public String deleteBudget(int id) {
        return budgetService.deleteBudget(id);
    }

    @PutMapping("/updateBudget")
    public Budget updateBudget(Budget budget) {
        return budgetService.updateBudget(budget);
    }
}
