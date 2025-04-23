package com.fftl.law_alarm_back.api.service;

import com.fftl.law_alarm_back.api.dto.LawSearchResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ApiLawService {

    private final String lawKey;
    private final String BASE_URL;

    public ApiLawService(@Value("${law.key}") String lawKey, @Value("${law.base-url}") String baseUrl) {
        this.lawKey = lawKey;
        this.BASE_URL = baseUrl;
    }

    public LawSearchResponse getData(){
        WebClient client = WebClient.builder().baseUrl(BASE_URL).build();

        String search = "소방";
        StringBuilder uri = new StringBuilder();
        uri.append("?OC=")
                .append(lawKey) //apikey
                .append("&target=eflaw&type=json&nw=2&query=") //검색 인자
                .append(search); //검색어

        Mono<LawSearchResponse> response = client.get()
                .uri(uri.toString())
                .retrieve()
                .bodyToMono(LawSearchResponse.class);

        return response.block();
    }
}
