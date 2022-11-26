package com.example.designsplitwise.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="groups")
public class Group extends BaseModel{
    private String name;
    @ManyToMany
    private List<User> participants;
    @ManyToOne
    private User admin;

    @OneToMany(mappedBy = "group")
    List<Expense> expences = new ArrayList<>();
}
