package com.example.moviefinder.Service;

import com.example.moviefinder.Entity.Profile;
import com.example.moviefinder.Repository.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepo repo;

    public Profile saveProfile(Profile profile) {
        return repo.save(profile);
    }
}
