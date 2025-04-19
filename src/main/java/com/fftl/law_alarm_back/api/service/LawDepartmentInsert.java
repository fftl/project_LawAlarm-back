package com.fftl.law_alarm_back.api.service;


import com.fftl.law_alarm_back.domain.LawDepartment;
import com.fftl.law_alarm_back.repository.LawDepartmentRepository;
import com.fftl.law_alarm_back.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ssl.SslProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class LawDepartmentInsert {

    private final LawDepartmentRepository lawDepartmentRepository;

    public void readCsv(){
        Utils utils = new Utils();

        try {
            ClassPathResource csvFile = new ClassPathResource("cptOfiCd.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(csvFile.getInputStream()));
            String line;
            while ((line = br.readLine())!=null) {
                List<String> aLine = new ArrayList<String>();
                String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
                aLine = Arrays.asList(lineArr);

                String id = aLine.get(1);
                String lawDepartmentName = aLine.get(2);

                if(utils.isNum(id.charAt(0)) &&  id.charAt(0) != '0'){
                    LawDepartment lawDepartment = LawDepartment.builder().id(id).lawDepartmentName(lawDepartmentName).build();
                    lawDepartmentRepository.save(lawDepartment);
                }
            }

        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
