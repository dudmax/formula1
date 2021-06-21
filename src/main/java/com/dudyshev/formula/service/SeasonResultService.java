package com.dudyshev.formula.service;

import java.util.Map;

public interface SeasonResultService {

    Map<String, Integer> getWinsByTeamPerYear(int position);
}
