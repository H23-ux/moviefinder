package com.example.moviefinder.controller;

import com.example.moviefinder.Entity.Profile;
import com.example.moviefinder.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
@CrossOrigin
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping
    public Profile saveProfile(@RequestBody Profile profile) {
        return service.saveProfile(profile);
    }
}
