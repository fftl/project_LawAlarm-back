package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.LawType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawTypeRepository extends JpaRepository<LawType, Long> {
}
