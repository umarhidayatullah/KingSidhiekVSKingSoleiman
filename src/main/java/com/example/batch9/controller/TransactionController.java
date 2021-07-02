package com.example.batch9.controller;

import com.example.batch9.entity.Transaction;
import com.example.batch9.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/addTransaction")
    public Transaction addTransaction(@RequestBody Transaction trans) {
        return transactionService.saveTrans(trans);
    }

    @PostMapping("/addTransactions")
    public List<Transaction> addTransactions(@RequestBody List<Transaction> transe) {
        return transactionService.saveTranse(transe);
    }

    @GetMapping("/getTransactions")
    public List<Transaction> getTransactions() {
        return transactionService.getTranse();
    }

    @GetMapping("/getTransactionTypeR")
    public Transaction getTransactionTypeR() {
        return transactionService.getTransTypeR();
    }

    @GetMapping("/getTransactionTypeS")
    public Transaction getTransactionTypeS() {
        return transactionService.getTransTypeS();
    }

    @DeleteMapping("/deleteTransaction/{id}")
    public String deleteTransaction(@PathVariable int id) {
        return transactionService.deleteTrans(id);
    }

    @PutMapping("/updateTransaction")
    public Transaction updateTransacction(@RequestBody Transaction trans) {
        return transactionService.updateTrans(trans);
    }

}

