package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.LawTypeAlarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawTypeAlarmRepository extends JpaRepository<LawTypeAlarm, Long> {
}
