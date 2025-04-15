package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.entity.Laws;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatuteRepository extends JpaRepository<Laws, Long> {

}
