package com.schedule.service;

import com.schedule.domain.v1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();

    User getById(Long userId);
}
