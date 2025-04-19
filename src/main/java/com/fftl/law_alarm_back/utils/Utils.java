package com.fftl.law_alarm_back.utils;

import org.springframework.stereotype.Component;

@Component
public class Utils {

    public boolean isNum(char c){
        if('0' <= c && c <= '9') return true;
        else return false;
    }
}
