package com.schedule.domain.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "office_time")
public class OfficeTime {

    @Id
    @GeneratedValue(strategy = AUTO, generator = "id_office_time")
    private Long id;

    private String maxOfficeTime;

    private String minOfficeTime;

    @JsonIgnore
    @OneToMany(mappedBy = "officeTime", cascade = ALL)
    private List<User> users;
}
