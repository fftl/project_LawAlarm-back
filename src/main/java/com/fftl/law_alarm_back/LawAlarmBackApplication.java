package com.fftl.law_alarm_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LawAlarmBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawAlarmBackApplication.class, args);
	}

	/*
	* TODO
	* 	1. GOOGLE LOGIN 추가하기
	* 	3. 소관부처 데이터 DB에 추가하기
	* */
}
