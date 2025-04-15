package com.fftl.law_alarm_back.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LawSearchResponse {

    @JsonProperty("LawSearch")
    private LawSearch lawSearch;
}
