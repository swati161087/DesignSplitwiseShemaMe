package com.example.designsplitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UserExpense extends BaseModel{
    @ManyToOne
    private User participant;
    @ManyToOne
    private Expense expense;
    private double amount;
}
