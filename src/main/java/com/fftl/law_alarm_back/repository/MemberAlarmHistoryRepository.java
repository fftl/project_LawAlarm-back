package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.MemberAlarmHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAlarmHistoryRepository extends JpaRepository<MemberAlarmHistory, Long> {
}
