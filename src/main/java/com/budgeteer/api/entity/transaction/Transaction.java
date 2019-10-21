package com.budgeteer.api.entity.transaction;

import com.budgeteer.api.constant.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
public class Transaction {
    
    public Transaction(BigDecimal amount, TransactionType transactionType, String description, Timestamp transactionTimestamp, String createUserId){
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
        this.transactionTimestamp = transactionTimestamp;
        this.createUserId = createUserId;
    }
    
    BigDecimal amount;
    TransactionType transactionType;
    String description;
    Timestamp transactionTimestamp;
    Timestamp createdTimestamp;
    Timestamp lastUpdatedTimestamp;
    String createUserId;
    String lastUpdateUserId;
    
}
