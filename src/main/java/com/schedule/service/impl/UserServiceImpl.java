package com.schedule.service.impl;

import com.schedule.domain.v1.model.Event;
import com.schedule.domain.v1.model.User;
import com.schedule.domain.v1.repository.EventRepository;
import com.schedule.domain.v1.repository.UserRepository;
import com.schedule.service.EventService;
import com.schedule.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
