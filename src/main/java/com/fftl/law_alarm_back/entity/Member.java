package com.fftl.law_alarm_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Member extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    @Builder
    public Member(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Builder
    public Member(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
