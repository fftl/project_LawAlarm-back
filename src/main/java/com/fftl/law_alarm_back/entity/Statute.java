package com.fftl.law_alarm_back.entity;

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
public class Statute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statuteId;
    private String statuteSerial;
    private String statuteName;
    private String statuteNickname;
    private String statuteCode;
    private LocalDateTime proclaimDate;
    private String proclaimNum;
    private int revisionStatus;
    private LocalDateTime enforcementDate;
    private String statuteLink;

    @ManyToOne
    @JoinColumn(name = "statute_category_id")
    private StatuteCategory statuteCategory;

    @OneToMany(mappedBy = "statute")
    private List<StatuteDepartment> statuteDepartmentList = new ArrayList<>();
}
