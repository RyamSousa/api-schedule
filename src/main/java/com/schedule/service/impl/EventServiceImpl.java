package com.schedule.service.impl;

import com.schedule.domain.v1.model.Event;
import com.schedule.domain.v1.repository.EventRepository;
import com.schedule.service.EventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
}
