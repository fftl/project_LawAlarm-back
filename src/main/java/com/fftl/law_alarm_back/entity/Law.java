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
@Table(name = "laws")
public class Law {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lawId;

    //법령일련번호
    private String lawSerial;

    //법령명한글
    private String lawName;

    //
    private LocalDateTime proclaimDate;
    private String proclaimNum;
    private int revisionStatus;
    private LocalDateTime enforcementDate;
    private String statuteLink;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "statute")
    private final List<StatuteDepartment> statuteDepartmentList = new ArrayList<>();
}
