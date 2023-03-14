package com.schedule.api.v1;

import com.schedule.domain.v1.model.Service;
import com.schedule.domain.v1.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/users")
public interface UserController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<User>> getAll();
}
