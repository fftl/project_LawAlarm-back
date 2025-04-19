package com.fftl.law_alarm_back.api.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class LawDepartmentInsertTest {

    LawDepartmentInsert lawDepartmentInsert = new LawDepartmentInsert();

    @Test
    @DisplayName("csv 테스트")
    void law_csv_test() {
        try {
            //파일 불러오기
            ClassPathResource csvFile = new ClassPathResource("cptOfiCd.csv");

            //파일 데이터를 InputStream으로 가져옵니다.
            BufferedReader br = new BufferedReader(new InputStreamReader(csvFile.getInputStream()));
            String line;

            while ((line = br.readLine()) != null) {
                List<String> aLine = new ArrayList<String>();
                String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                aLine = Arrays.asList(lineArr);

            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}