package com.fftl.law_alarm_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "law_department")
@Entity
public class LawDepartment extends BaseTime{

    @Id
    @Column(name = "law_department_id")
    private Long id;

    //소관부처 이름
    private String lawDepartmentName;

    @OneToMany(mappedBy = "lawDepartment")
    private List<LawDepartmentRelation> laws = new ArrayList<>();
}
