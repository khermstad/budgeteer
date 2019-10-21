package com.budgeteer.api.service;

import com.budgeteer.api.entity.transaction.Transaction;
import com.budgeteer.api.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    
    private TransactionRepository transactionRepository;
    
    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    
    List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
    
}
