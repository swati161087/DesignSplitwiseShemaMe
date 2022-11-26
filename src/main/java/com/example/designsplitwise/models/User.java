package com.example.designsplitwise.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name="users")
public class User extends BaseModel{
    private String name;
    private String password;
    @ManyToMany
    private List<User> myFriends=new ArrayList<>();
    @ManyToMany(mappedBy = "myFriends")
    private List<User> friendWith=new ArrayList<>();
    @OneToMany(mappedBy = "participant")
    private List<UserExpense> userExpenses=new ArrayList<>();
    @ManyToMany(mappedBy = "participants")
    private List<Group> groups=new ArrayList<>();
}
