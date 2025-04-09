package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.config.KeyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.*;

class GetLawDataTest {

    @Test
    public void getData(){

        GetLawData getLawData = new GetLawData(new KeyConfig());
        final String BASE_URL = "http://www.law.go.kr/DRF/lawSearch.do";
        WebClient client = WebClient.builder().baseUrl(BASE_URL).build();

        String search = "소방";
        StringBuilder uri = new StringBuilder();
        uri.append("?OC="+getLawData.getLawKey());
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
}