package com.fftl.law_alarm_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Department {

    @Id
    private Long departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<StatuteDepartment> statuteDepartmentList = new ArrayList<>();
}
