package com.dudyshev.formula.repository;

import com.dudyshev.formula.dto.ITeamsWInResponse;
import com.dudyshev.formula.model.SeasonResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonResultRepository extends JpaRepository<SeasonResult, Long> {

    @Query(value = "SELECT TEAMS.NAME as teamName, count(TEAMS.NAME) as winTimes " +
            "FROM SEASON_RESULTS " +
            "INNER JOIN TEAMS ON SEASON_RESULTS.TEAM_ID=TEAMS.ID " +
            "WHERE SEASON_RESULTS.POSITION = ?1 " +
            "GROUP BY teamName " +
            "ORDER BY winTimes", nativeQuery = true)
    List<ITeamsWInResponse> getWinsByTeamPerYear(int position);
}
