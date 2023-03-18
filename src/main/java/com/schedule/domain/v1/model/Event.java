package com.schedule.domain.v1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "events")
// TEMPORARY (go to the firebase)
public class Event {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_event")
    private Long id;

    @NotNull
    private String clientName;

    @NotNull
    private String clientPhone;

    @NotNull
    @Column(name = "start_date")
    private String start;

    @NotNull
    @Column(name = "end_date")
    private String end;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;
}
