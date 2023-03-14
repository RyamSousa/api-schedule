package com.schedule.api.v1.impl;


import com.schedule.api.v1.ServiceController;
import com.schedule.domain.v1.model.Service;
import com.schedule.service.ServiceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceControllerImpl implements ServiceController {

    private ServiceService serviceService;

    @Override
    public ResponseEntity<List<Service>> getAll() {
        return ResponseEntity.ok(serviceService.getAll());
    }

    @Override
    public ResponseEntity<List<Service>> getServicesByUser(Long id) {
        return ResponseEntity.ok(serviceService.findByUser(id));
    }
}
