package com.schedule.service;

import com.schedule.domain.v1.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

    List<Event> getAll();
}
