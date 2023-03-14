package com.schedule.domain.v1.repository;

import com.schedule.domain.v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
