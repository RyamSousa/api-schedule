package com.schedule.api.v1.impl;


import com.schedule.api.v1.EventController;
import com.schedule.domain.v1.model.Event;
import com.schedule.service.EventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EventControllerImpl implements EventController {

    private EventService eventService;

    @Override
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(eventService.getAll());
    }
}
