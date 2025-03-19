package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.StatuteDepartmentRepository;

public class StatuteDepartmentService {

    private StatuteDepartmentRepository statuteDepartmentRepository;

    public StatuteDepartmentService(StatuteDepartmentRepository statuteDepartmentRepository) {
        this.statuteDepartmentRepository = statuteDepartmentRepository;
    }
}
