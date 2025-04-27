package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.domain.Member;
import com.fftl.law_alarm_back.exception.NotFoundException;
import com.fftl.law_alarm_back.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long create(String email, String refresh){
        Member saveMember = memberRepository.save(
                Member.builder()
                .email(email)
                .refresh(refresh).build());
        return saveMember.getId();
    }

    @Transactional
    public Member readEmail(String email) {
//        Member member = memberRepository.findByEmail(email).orElseThrow(() -> new NotFoundException("멤버를 찾을 수 없습니다."));
        return memberRepository.findByEmail(email).orElse(null);
    }
}
