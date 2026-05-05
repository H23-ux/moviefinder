package com.example.moviefinder.controller;

import com.example.moviefinder.Entity.Analysis;
import com.example.moviefinder.Service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suggestion")
@CrossOrigin
public class SuggestionController {

    @Autowired
    private SuggestionService service;

    @PostMapping
    public String getSuggestion(@RequestBody Analysis analysis) {
        return service.generateSuggestion(analysis);
    }
}
