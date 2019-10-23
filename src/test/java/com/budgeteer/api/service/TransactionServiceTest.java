package com.budgeteer.api.service;

import com.budgeteer.api.entity.transaction.Transaction;
import com.budgeteer.api.repository.TransactionRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.budgeteer.api.util.TransactionBuilderUtility;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class TransactionServiceTest {
    
    @Autowired
    TransactionService transactionService;
    
    @Autowired
    TransactionBuilderUtility transactionBuilderUtility;
    
    @Autowired
    TransactionRepository transactionRepository;
    
    @AfterEach
    public void clearRepository(){
        transactionRepository.deleteAll();
    }

    @Test
    void getAllTransactions_noTransactions() {
        assertEquals(0, transactionService.getAllTransactions().size());
    }
    
    @Test
    void getAllTransactions_oneTransaction() {
        Transaction transaction = transactionBuilderUtility.getBasicTransaction();
        transactionService.saveTransaction(transaction);
        assertEquals(1, transactionService.getAllTransactions().size());
    }
    
    @Test
    void saveTransaction(){
        Transaction transaction = transactionBuilderUtility.getBasicTransaction();
        assertEquals(transaction.getAmount(), transactionService.saveTransaction(transaction).getAmount());
        
    }
    
}