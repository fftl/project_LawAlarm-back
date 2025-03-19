package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.StatuteRepository;

public class StatuteService {

    private StatuteRepository statuteRepository;

    public StatuteService(StatuteRepository statuteRepository) {
        this.statuteRepository = statuteRepository;
    }
}
