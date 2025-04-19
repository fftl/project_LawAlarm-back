package com.fftl.law_alarm_back.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "law_type_alarm")
@Entity
public class LawTypeAlarm {

    @Id
    @GeneratedValue
    @Column(name = "law_type_alarm_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "law_type_id")
    private LawType lawType;
}