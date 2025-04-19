package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.LawDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawDepartmentRepository extends JpaRepository<LawDepartment, Long> {
}
