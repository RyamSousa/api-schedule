package com.schedule.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceService {

    List<com.schedule.domain.v1.model.Service> getAll();

    List<com.schedule.domain.v1.model.Service> findByUser(Long userId);
}
