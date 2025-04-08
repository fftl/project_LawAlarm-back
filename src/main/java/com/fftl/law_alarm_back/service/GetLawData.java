package com.fftl.law_alarm_back.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@RequiredArgsConstructor
@Service
public class GetLawData {

    //TODO
    //properties 에 키넣기

    String key = "";

    public void getData(){
        WebClient client = WebClient.builder().baseUrl("http://www.law.go.kr/DRF/lawSearch.do?OC="+key).build();

    }

}
