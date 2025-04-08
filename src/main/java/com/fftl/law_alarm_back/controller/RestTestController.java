package com.fftl.law_alarm_back.controller;

import com.fftl.law_alarm_back.service.GetLawData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestTestController {

    private final GetLawData getLawData;

    @GetMapping("/lee")
    public String test(){
        return getLawData.getData();
    }

    @GetMapping("/data")
    public String data(){
        return "spring boot : connect success";
    }
}
