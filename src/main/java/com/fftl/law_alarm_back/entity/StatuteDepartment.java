package com.fftl.law_alarm_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class StatuteDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StatuteDepartmentId;

    @ManyToOne
    @JoinColumn(name = "statute_id")
    private Statute statute;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
