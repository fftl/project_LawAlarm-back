package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.MemberSearchAlarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSearchAlarmRepository extends JpaRepository<MemberSearchAlarm, Long> {
}
