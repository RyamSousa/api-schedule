package com.schedule.api.v1;

import com.schedule.domain.v1.model.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/services")
public interface ServiceController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Service>> getAll();

    @GetMapping(value = "/user/{id}", produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Service>> getServicesByUser(@PathVariable Long id);
}
