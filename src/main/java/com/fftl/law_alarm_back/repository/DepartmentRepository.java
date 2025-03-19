package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
