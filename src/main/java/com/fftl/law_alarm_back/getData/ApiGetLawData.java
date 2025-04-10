package com.fftl.law_alarm_back.getData;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
public class ApiGetLawData {

    private final String lawKey;
    private final String BASE_URL;

    public ApiGetLawData(@Value("${law.key}")String lawKey, @Value("${law.base-url}")String BASE_URL) {
        this.lawKey = lawKey;
        this.BASE_URL = BASE_URL;
    }

    public String getData(){
        WebClient client = WebClient.builder().baseUrl(BASE_URL).build();

        String search = "소방";
        StringBuilder uri = new StringBuilder();
        uri.append("?OC=")
                .append(lawKey) //apikey
                .append("&target=eflaw&type=json&nw=2&query=") //검색 인자
                .append(search); //검색어

        log.info("uri = {}", uri);

        String jsonData = client.post()
                .uri(uri.toString())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return jsonData;
    }
}
