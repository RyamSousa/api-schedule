package com.schedule.api.domain.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.AUTO;

@Entity(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_service")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Integer duration;

    @NotNull
    private Integer value;

    @NotNull
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "service", cascade = ALL)
    private List<Event> events;
}
