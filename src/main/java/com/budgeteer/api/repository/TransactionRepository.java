package com.budgeteer.api.repository;

import com.budgeteer.api.entity.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    
}
