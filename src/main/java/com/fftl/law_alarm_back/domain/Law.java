package com.fftl.law_alarm_back.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "law")
public class Law extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //법령일련번호
    private String lawSerial;

    //법령명한글
    private String lawName;

    //법령명
    private String lawData;

    //공포 일자
    private LocalDateTime proclaimDate;

    //공포 번호
    private String proclaimNum;

    //재개정구분
    private int revisionStatus;

    //시행일자
    private LocalDateTime enforcementDate;

    //법령링크
    private String lawLink;

    //최신여부
    private LocalDateTime isLatest;

    //소관부처IDs
    @OneToMany(mappedBy = "law")
    private List<LawDepartmentRelation> lawDepartments = new ArrayList<>();

    //법령구분ID
    @ManyToOne
    @JoinColumn(name = "law_type_id")
    private LawType lawType;

    @OneToMany(mappedBy = "law")
    private List<MemberAlarmHistory> memberAlarmHistories = new ArrayList<>();
}
