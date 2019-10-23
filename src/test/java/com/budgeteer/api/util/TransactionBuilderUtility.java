package com.budgeteer.api.util;

import com.budgeteer.api.constant.TransactionType;
import com.budgeteer.api.entity.transaction.Transaction;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class TransactionBuilderUtility {
    
    public Transaction getBasicTransaction(){
        Transaction transaction = new Transaction();
        transaction.setAmount(new BigDecimal(10.00));
        transaction.setTransactionType(TransactionType.CHECKING);
        transaction.setDescription("Dummy Description: DEPOSIT");
        transaction.setCreateUserId("TEST_USER_ID");
        transaction.setTransactionTimestamp(LocalDateTime.now());
        transaction.setCreatedTimestamp(LocalDateTime.now());
        return transaction;
    }
}
