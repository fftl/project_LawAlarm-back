package com.fftl.law_alarm_back.repository;

import com.fftl.law_alarm_back.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
