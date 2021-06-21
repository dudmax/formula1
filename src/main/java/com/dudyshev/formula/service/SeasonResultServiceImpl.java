package com.dudyshev.formula.service;

import com.dudyshev.formula.dto.ITeamsWInResponse;
import com.dudyshev.formula.repository.SeasonResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
@Transactional
public class SeasonResultServiceImpl implements SeasonResultService {

    @Autowired
    private SeasonResultRepository seasonResultRepository;

    @Override
    public Map<String, Integer> getWinsByTeamPerYear(int position) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        for (ITeamsWInResponse iTeamsWInResponse: this.seasonResultRepository.getWinsByTeamPerYear(position)) {
            hashMap.put(iTeamsWInResponse.getTeamName(), iTeamsWInResponse.getWinTimes());
        }
        return hashMap;
    }
}
