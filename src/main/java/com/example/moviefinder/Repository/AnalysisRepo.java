package com.example.moviefinder.Repository;

import com.example.moviefinder.Entity.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalysisRepo extends JpaRepository<Analysis, Long> {
}
