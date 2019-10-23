package com.budgeteer.api.entity.transaction;

import com.budgeteer.api.constant.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
@Entity
public class Transaction {
    
    public Transaction(BigDecimal amount, TransactionType transactionType, String description, LocalDateTime transactionTimestamp, String createUserId){
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
        this.transactionTimestamp = transactionTimestamp;
        this.createUserId = createUserId;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;
    private BigDecimal amount;
    private TransactionType transactionType;
    private String description;
    private LocalDateTime transactionTimestamp;
    private LocalDateTime createdTimestamp;
    private LocalDateTime lastUpdatedTimestamp;
    private String createUserId;
    private String lastUpdateUserId;
    
}
