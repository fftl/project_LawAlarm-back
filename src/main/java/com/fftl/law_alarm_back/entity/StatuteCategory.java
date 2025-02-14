package com.fftl.law_alarm_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class StatuteCategory {

    /*
    * 대통령령, 고용노동부령, 법령 ...
    * */

    @Id
    private Long statuteCategoryId;
    private String StatuteCategoryName;

    @OneToMany(mappedBy = "statuteCategory")
    private List<Statute> statuteList = new ArrayList<>();
}
