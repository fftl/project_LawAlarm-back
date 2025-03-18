package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
