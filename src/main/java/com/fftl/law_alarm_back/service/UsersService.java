package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.UsersRepository;

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
}
