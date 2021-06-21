package com.dudyshev.formula.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Racers")
public class Racer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "racer")
    @JsonIgnore
    private List<SeasonResult> seasonResults;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<SeasonResult> getSeasonResults() {
        return seasonResults;
    }

    public void setSeasonResults(List<SeasonResult> seasonResults) {
        this.seasonResults = seasonResults;
    }
}
