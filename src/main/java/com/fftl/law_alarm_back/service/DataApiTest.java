package com.fftl.law_alarm_back.service;

import java.net.MalformedURLException;
import java.net.URL;

public class DataApiTest {

    public String getData(){
        try {
            URL url = new URL("https://open.law.go.kr/LSO/openApi/guideResult.do");
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

        
        return "";
    }
}
