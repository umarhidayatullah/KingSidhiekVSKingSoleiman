package com.example.batch9.service;

import com.example.batch9.entity.Transaction;
import com.example.batch9.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTrans(Transaction trans) {
        return transactionRepository.save(trans);
    }

    public List<Transaction> saveTranse(List<Transaction> transe) {
        return transactionRepository.saveAll(transe);
    }

    public List<Transaction> getTranse() {
        return transactionRepository.findAll();
    }

    public Transaction getTransTypeR() {
        return transactionRepository.findByTypeR();
    }

    public Transaction getTransTypeS() {
        return transactionRepository.findByTypeS();
    }

    public String deleteTrans(int id) {
        transactionRepository.deleteById(id);
        return "Terimakasih Juara coding";
    }

    public Transaction updateTrans(Transaction trans) {
        Transaction existTrans = transactionRepository.findById(trans.getId()).orElse(null);
        existTrans.setType(trans.getType());
        existTrans.setUser_id(trans.getUser_id());
        existTrans.setCompany_id(trans.getCompany_id());
        existTrans.setAmount(trans.getAmount());
        existTrans.setDate(trans.getDate());
        return transactionRepository.save(existTrans);
    }
}
