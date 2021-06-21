package com.dudyshev.formula.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Seasons")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int year;

    @OneToMany(mappedBy = "season")
    @JsonIgnore
    private List<SeasonResult> seasonResults;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<SeasonResult> getSeasonResults() {
        return seasonResults;
    }

    public void setSeasonResults(List<SeasonResult> seasonResults) {
        this.seasonResults = seasonResults;
    }
}
