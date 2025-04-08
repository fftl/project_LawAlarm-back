package com.fftl.law_alarm_back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
public class Law {

    private Integer status; //"현행연혁코드": "시행예정",
    private Integer serial; //"법령일련번호": "270327",
    //자법타법여부 //"자법타법여부": "",
    private String link; //"법령상세링크": "/DRF/lawService.do?OC=fftl0785&target=eflaw&MST=270327&type=HTML&mobileYn=&efYd=20250702",
    private String title; //"법령명한글": "국립소방병원의 설립 및 운영에 관한 법률",
    private String lawDivision; //"법령구분명": "법률",
    private String category; //"소관부처명": "소방청",
    private Integer promulgateCode; //"공포번호": "20863",
    private String reDivision; //"제개정구분명": "일부개정",
    private String categoryCode; //"소관부처코드": "1661000",
    //id //"id": "1",
    private String lawId; //"법령ID": "013987",
    //공동부령정보 //"공동부령정보": "",
    private LocalDate startDate; //"시행일자": "20250702",
    private LocalDate promulgateDate; //"공포일자": "20250401",
}
