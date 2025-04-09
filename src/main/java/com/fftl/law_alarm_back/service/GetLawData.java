package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.config.KeyConfig;
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
@Service
public class GetLawData {

    private final KeyConfig keyConfig;

    public GetLawData(KeyConfig keyConfig) {
        this.keyConfig = keyConfig;
    }

    @Value("${law.key}")
    private String lawKey;

    public void getData(){
        final String BASE_URL = "http://www.law.go.kr/DRF/lawSearch.do";
        WebClient client = WebClient.builder().baseUrl(BASE_URL).build();

        String search = "소방";
        StringBuilder uri = new StringBuilder();
        uri.append("?OC="+lawKey);
        uri.append("&target=eflaw&type=json&nw=2&query="); // 설정값
        uri.append(search);

        System.out.println(uri.toString());

        String jsonData = client.post()
                .uri(uri.toString())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(jsonData);
    }

    public String getLawKey() {
        return keyConfig.getLawKey();
    }
}
