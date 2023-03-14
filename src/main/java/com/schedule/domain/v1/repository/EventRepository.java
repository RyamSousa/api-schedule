package com.schedule.domain.v1.repository;

import com.schedule.domain.v1.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
