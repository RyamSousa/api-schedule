package com.schedule.api.v1;

import com.schedule.domain.v1.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface UserController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<User>> getAll();

    @GetMapping(value = "/{userId}", produces = APPLICATION_JSON_VALUE)
    ResponseEntity<User> getUserById(@PathVariable Long userId);
}
