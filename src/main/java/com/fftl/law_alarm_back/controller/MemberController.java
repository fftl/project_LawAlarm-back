package com.fftl.law_alarm_back.controller;

import com.fftl.law_alarm_back.config.jwt.JwtProvider;
import com.fftl.law_alarm_back.domain.Member;
import com.fftl.law_alarm_back.dto.LoginRequestDto;
import com.fftl.law_alarm_back.dto.LoginResponseDto;
import com.fftl.law_alarm_back.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {

    private final MemberService memberService;
    private final JwtProvider jwtProvider;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> saveMember(@RequestBody LoginRequestDto loginRequestDto) {
        Member member = memberService.readEmail(loginRequestDto.getEmail());

        if(member == null){

            String token = jwtProvider.generateToken(member.getEmail());
            return ResponseEntity.ok(Map.of("token", token));
        }
    }
}
