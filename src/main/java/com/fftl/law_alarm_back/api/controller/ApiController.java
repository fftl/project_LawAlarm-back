package com.fftl.law_alarm_back.api.controller;

import com.fftl.law_alarm_back.api.service.LawDepartmentInsert;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/data")
@RestController
public class ApiController {

    private final LawDepartmentInsert lawDepartmentInsert;

    @PostMapping("/department")
    public ResponseEntity<Void> insertDepartment(){
        lawDepartmentInsert.readCsv();
        return ResponseEntity.ok().build();
    }

}
