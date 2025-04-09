package com.fftl.law_alarm_back.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KeyConfig {

    @Value("${law.key}")
    private String lawKey;

    public String getLawKey() {return lawKey;}
}
