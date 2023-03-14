package com.schedule.api.domain.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.GenerationType.AUTO;

@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_client")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = ALL)
    private List<Event> events;
}
