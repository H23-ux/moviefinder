package com.example.moviefinder.Repository;

import com.example.moviefinder.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile, Long> {
}
