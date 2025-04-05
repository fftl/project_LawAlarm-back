package com.fftl.law_alarm_back.controller;

import com.fftl.law_alarm_back.service.DataApiTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestTestController {

    private final DataApiTest dataApiTest;

    @GetMapping("/lee")
    public String test(){
        return dataApiTest.getData();
    }

    @GetMapping("/data")
    public String run() {
        return "hello dongmin";
    }
}
