package com.schedule.api.v1;

import com.schedule.domain.v1.model.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/events")
public interface EventController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Event>> getAll();
}
