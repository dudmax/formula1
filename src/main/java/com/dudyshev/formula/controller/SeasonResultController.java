package com.dudyshev.formula.controller;

import com.dudyshev.formula.service.SeasonResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SeasonResultController {

    @Autowired
    private SeasonResultService seasonResultService;

    @GetMapping("/")
    public ResponseEntity<Map<String, Integer>> getWinsByTeamPerYear(@RequestParam("position") int position ) {
        return ResponseEntity.ok().body(seasonResultService.getWinsByTeamPerYear(position));
    }

}
