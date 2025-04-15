package com.fftl.law_alarm_back.api.service;

import com.fftl.law_alarm_back.api.dto.LawSearchResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ApiLawServiceTest {

    @Test
    @DisplayName("API 호출 테스트")
    void getData() throws Exception{
        //test Properties에 있는 환경변수 가져오기.
        Properties props = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            props.load(input);
        }

        String lawKey = props.getProperty("law.key");
        String BASE_URL = props.getProperty("law.base-url");

        ApiLawService apiLawService = new ApiLawService(lawKey, BASE_URL);
        LawSearchResponse jsonData = apiLawService.getData();

        log.info("jsonData = {}", jsonData);
    }
}