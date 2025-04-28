package com.fftl.law_alarm_back.controller;

import com.fftl.law_alarm_back.config.jwt.JwtProvider;
import com.fftl.law_alarm_back.domain.Member;
import com.fftl.law_alarm_back.dto.LoginRequestDto;
import com.fftl.law_alarm_back.dto.LoginResponseDto;
import com.fftl.law_alarm_back.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
            Member createMember = memberService.create(loginRequestDto.getEmail());
            String access = jwtProvider.createAccessToken(createMember.getId(), loginRequestDto.getEmail());
            String refresh = jwtProvider.createRefreshToken(createMember.getId(), loginRequestDto.getEmail());

            memberService.updateRefresh(createMember, refresh);

            return new ResponseEntity<>(new LoginResponseDto(loginRequestDto.getEmail(), access, refresh), HttpStatus.OK);

        } else {
            String access = jwtProvider.createAccessToken(member.getId(), loginRequestDto.getEmail());
            String refresh = jwtProvider.createRefreshToken(member.getId(), loginRequestDto.getEmail());

            memberService.updateRefresh(member, refresh);

            return new ResponseEntity<>(new LoginResponseDto(loginRequestDto.getEmail(), access, refresh), HttpStatus.OK);

        }
    }
}
