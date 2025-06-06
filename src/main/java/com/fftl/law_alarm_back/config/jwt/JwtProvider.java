package com.fftl.law_alarm_back.config.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.*;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Slf4j
@Component
public class JwtProvider {

    @Value("${jwt.secret.appKey}")
    private String secretKey;

    @Value("${jwt.access}")
    private Long accessExpiration; // 10분

    @Value("${jwt.refresh}")
    private Long refreshExpiration; // 1주일

    private SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }

    public String createRefreshToken(Long memberId, String email){
        return generateToken(memberId, email, refreshExpiration);
    }

    public String createAccessToken(Long memberId, String email){
        return generateToken(memberId, email, accessExpiration);
    }

    public String generateToken(Long memberId, String email, Long expiration) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expiration);

        return Jwts.builder()
                .subject(memberId.toString())
                .claim("email", email)
                .issuedAt(now)
                .expiration(expiryDate)
                .signWith(getSecretKey(), Jwts.SIG.HS256)
                .compact();
    }

    //token으로부터 email을 찾아냅니다.
    public String getEmailFromToken(String token) {
        Jws<Claims> parse = Jwts.parser()
                .verifyWith(getSecretKey())
                .build()
                .parseSignedClaims(token);

        return parse.getPayload().get("email").toString();
    }

    //내가 사용했던 secretKey를 이용하여
    //이 토큰이 유효한 상태의 토큰인지 확인
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(getSecretKey())
                    .build()
                    .parseSignedClaims(token);

            return true;
        } catch (Exception e) {

            return false;
        }
    }
}