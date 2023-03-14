package com.schedule.api.domain.v1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.AUTO;

@Entity(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_event")
    private Long id;

    @NotNull
    @Column(name = "start_date")
    private String start;

    @NotNull
    @Column(name = "end_date")
    private String end;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
}
