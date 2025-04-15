package com.fftl.law_alarm_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


/*
 * 대통령령, 고용노동부령, 법령 ...
 * */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "category")
public class Category {


    @Id
    private Long categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "statuteCategory")
    private List<Law> lawList = new ArrayList<>();
}
