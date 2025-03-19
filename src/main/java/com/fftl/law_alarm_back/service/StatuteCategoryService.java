package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.StatuteCategoryRepository;

public class StatuteCategoryService {

    private StatuteCategoryRepository statuteCategoryRepository;

    public StatuteCategoryService(StatuteCategoryRepository statuteCategoryRepository) {
        this.statuteCategoryRepository = statuteCategoryRepository;
    }
}
