package com.example.moviefinder.Service;

import com.example.moviefinder.Entity.Analysis;
import com.example.moviefinder.Repository.AnalysisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalysisService {

    @Autowired
    private AnalysisRepo repo;

    public Analysis saveAnalysis(Analysis analysis) {
        return repo.save(analysis);
    }
}
