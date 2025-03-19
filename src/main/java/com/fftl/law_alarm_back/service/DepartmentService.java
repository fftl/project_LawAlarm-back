package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.DepartmentRepository;

public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}
