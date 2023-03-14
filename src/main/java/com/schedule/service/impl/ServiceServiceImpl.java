package com.schedule.service.impl;

import com.schedule.domain.v1.model.Service;
import com.schedule.domain.v1.repository.ServiceRepository;
import com.schedule.service.ServiceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    public List<Service> getAll() {
        return serviceRepository.findAll();
    }

    @Override
    public List<Service> findByUser(Long userId) {
        return serviceRepository.findByUserId(userId);
    }
}
