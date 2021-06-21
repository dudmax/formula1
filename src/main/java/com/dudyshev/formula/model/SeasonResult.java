package com.dudyshev.formula.model;

import javax.persistence.*;

@Entity
@Table(name = "SEASON_RESULTS")
public class SeasonResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long position;
    @ManyToOne
    @JoinColumn(name = "racer_id")
    private Racer racer;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Racer getRacer() {
        return racer;
    }

    public void setRacer(Racer racer) {
        this.racer = racer;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }
}
