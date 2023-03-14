package com.schedule.api.v1.impl;


import com.schedule.api.v1.EventController;
import com.schedule.api.v1.UserController;
import com.schedule.domain.v1.model.Event;
import com.schedule.domain.v1.model.User;
import com.schedule.service.EventService;
import com.schedule.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsersControllerImpl implements UserController {

    private UserService userService;

    @Override
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
