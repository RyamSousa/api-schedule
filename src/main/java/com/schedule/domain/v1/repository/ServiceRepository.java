package com.schedule.domain.v1.repository;

import com.schedule.domain.v1.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    List<Service> findByUserId(Long userId);
}
