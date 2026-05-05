package com.example.moviefinder.controller;

import com.example.moviefinder.Entity.Analysis;
import com.example.moviefinder.Service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/analysis")
@CrossOrigin
public class AnalysisController {

    @Autowired
    private AnalysisService service;

    @PostMapping
    public Analysis saveAnalysis(@RequestBody Analysis analysis) {
        return service.saveAnalysis(analysis);
    }
}
