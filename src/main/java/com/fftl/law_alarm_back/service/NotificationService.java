package com.fftl.law_alarm_back.service;

import com.fftl.law_alarm_back.repository.NotificationRepository;

public class NotificationService {

    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
}
