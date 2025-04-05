package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.entity.Department;
import com.fftl.law_alarm_back.entity.Statute;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import javax.xml.XMLConstants;

@Slf4j
@RequiredArgsConstructor
@Service
public class DataApiTest {

    public String getData(){
        WebClient client = WebClient.builder()
                .defaultHeader("Content-type" , "application/x-www-form-urlencoded;charset=utf-8")
                .baseUrl("http://www.law.go.kr/DRF/lawSearch.do?OC=fftl0785&target=eflaw&query=소방")
                .build();

        String xmlData = client.get().retrieve().bodyToMono(String.class).block();

        try {
            // 문자열을 InputStream으로 변환
            InputStream is = new ByteArrayInputStream(xmlData.getBytes("UTF-8"));

            // DocumentBuilder로 파싱
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);

            // 루트 요소 얻기
            doc.getDocumentElement().normalize();

            NodeList lawNodes = doc.getElementsByTagName("law");

//            for (int i = 0; i < lawNodes.getLength(); i++) {
//                Node node = lawNodes.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//                    Element element = (Element) node;
//                    Statute statute = new Statute();
//                    statute.
//                }
//            }
//
//            // name, age 값 추출
//            int totalCnt = Integer.parseInt(root.getElementsByTagName("totalCnt").item(0).getTextContent());
//            int nowCnt = Integer.parseInt(root.getElementsByTagName("numOfRows").item(0).getTextContent());
//            String resultMsg = root.getElementsByTagName("resultMsg").item(0).getTextContent();
//
//            log.info("totalCnt: {}", totalCnt);
//            System.out.println("나이: " + age);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xmlData;
    }


}
