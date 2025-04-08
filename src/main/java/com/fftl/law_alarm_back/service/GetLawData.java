package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.dto.LawSearch;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class GetLawData {

    @Value("${law.key}")
    private String lawKey;

    public void getData(){
//        WebClient client = WebClient.builder().baseUrl("http://www.law.go.kr/DRF/lawSearch.do?OC="+lawKey).build();
//
//        client.post()
//                .uri("type=json&query=소방")
//                .body( );
    }

}
