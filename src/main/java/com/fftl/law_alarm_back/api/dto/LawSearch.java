package com.fftl.law_alarm_back.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LawSearch {

    private List<LawData> law;
    private String resultMsg;

    @JsonProperty("키워드")
    private String keyword;

    private String page;
    private String resultCode;
    private String target;
    private String totalCnt;
    private String section;
    private String numOfRows;
}
