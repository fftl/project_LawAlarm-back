package com.fftl.law_alarm_back.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LawData {

    @JsonProperty("현행연혁코드")
    private String status; //"현행연혁코드": "시행예정",

    @JsonProperty("법령일련번호")
    private String serial; //"법령일련번호": "270327",
    //자법타법여부 //"자법타법여부": "",

    @JsonProperty("법령상세링크")
    private String link; //"법령상세링크": "/DRF/lawService.do?OC=fftl0785&target=eflaw&MST=270327&type=HTML&mobileYn=&efYd=20250702",

    @JsonProperty("법령명한글")
    private String title; //"법령명한글": "국립소방병원의 설립 및 운영에 관한 법률",

    @JsonProperty("법령구분명")
    private String lawDivision; //"법령구분명": "법률",

    @JsonProperty("소관부처명")
    private String category; //"소관부처명": "소방청",

    @JsonProperty("공포번호")
    private String promulgateCode; //"공포번호": "20863",

    @JsonProperty("제개정구분명")
    private String reDivision; //"제개정구분명": "일부개정",

    @JsonProperty("소관부처코드")
    private String categoryCode; //"소관부처코드": "1661000",

    //id //"id": "1",
    @JsonProperty("법령ID")
    private String lawId; //"법령ID": "013987",

    //공동부령정보 //"공동부령정보": "",
    @JsonProperty("시행일자")
    private String startDate; //"시행일자": "20250702",

    @JsonProperty("공포일자")
    private String promulgateDate; //"공포일자": "20250401",
}
