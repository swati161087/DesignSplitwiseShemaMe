package com.example.designsplitwise.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel {
    @ManyToOne
    private Group group;
    @ManyToOne
    private User friend;
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenses =new ArrayList<>();
    private double expenseAmount;
    private String description;

}