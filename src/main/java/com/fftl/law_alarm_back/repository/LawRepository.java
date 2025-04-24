package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.Law;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawRepository extends JpaRepository<Law, Long> {
}
