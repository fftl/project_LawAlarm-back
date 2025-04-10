package com.fftl.law_alarm_back.getData;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


class ApiGetLawDataTest {

    @Test
    @DisplayName("API 호출 테스트")
    void getData() throws IOException {

        //test Properties에 있는 환경변수 가져오기.
        Properties props = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            props.load(input);
        }

        String lawKey = props.getProperty("law.key");
        String BASE_URL = props.getProperty("law.base-url");

        ApiGetLawData apiGetLawData = new ApiGetLawData(lawKey, BASE_URL);
        String jsonData = apiGetLawData.getData();
    }
}