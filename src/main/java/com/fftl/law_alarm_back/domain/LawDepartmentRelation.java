package com.fftl.law_alarm_back.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class LawDepartmentRelation extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "law_department_relation_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "law_department_id")
    private LawDepartment lawDepartment;

    @ManyToOne
    @JoinColumn(name = "law_id")
    private Law law;
}
