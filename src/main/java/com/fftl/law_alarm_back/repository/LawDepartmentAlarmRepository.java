package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.LawDepartmentAlarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawDepartmentAlarmRepository extends JpaRepository<LawDepartmentAlarm, Long> {
}
