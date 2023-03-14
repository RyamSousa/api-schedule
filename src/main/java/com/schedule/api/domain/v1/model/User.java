package com.schedule.api.domain.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.AUTO;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_user")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String occupation;

    @JsonIgnore
    @NotNull
    @OneToMany(mappedBy = "user", cascade = ALL)
    private List<Service> services;

    @NotNull
    @ManyToMany(fetch = EAGER)
    private List<Event> events = new ArrayList<>();
}
