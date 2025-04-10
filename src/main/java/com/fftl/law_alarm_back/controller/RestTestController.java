package com.fftl.law_alarm_back.controller;

import com.fftl.law_alarm_back.getData.ApiGetLawData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestTestController {

    private final ApiGetLawData getLawData;

    @GetMapping("/lee")
    public String test(){
//        return getLawData.getData();
        return "test";
    }


    @GetMapping("/data")
    public String data(){
        return "spring boot : connect success";
    }
}
