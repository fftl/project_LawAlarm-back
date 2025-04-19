package com.fftl.law_alarm_back.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "law_department_alarm")
@Entity
public class LawDepartmentAlarm {

    @Id
    @GeneratedValue
    @Column(name = "law_department_alarm_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "law_department_id")
    private LawDepartment lawDepartment;
}
