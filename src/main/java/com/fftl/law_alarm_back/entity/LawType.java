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
@Table(name = "law_type")
public class LawType extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "law_type_id")
    private Long id;

    //법령종류명
    private String lawTypeName;

    @OneToMany(mappedBy = "lawType")
    private List<Law> laws = new ArrayList<>();
}
