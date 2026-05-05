package com.example.moviefinder.Service;

import com.example.moviefinder.Entity.Analysis;
import org.springframework.stereotype.Service;

@Service
public class SuggestionService {

    public String generateSuggestion(Analysis analysis) {

        int introvertScore = 0;
        int extrovertScore = 0;

       
        if (analysis.getQuestion1().equalsIgnoreCase("yes")) introvertScore++;
        else extrovertScore++;

        if (analysis.getQuestion2().equalsIgnoreCase("yes")) introvertScore++;
        else extrovertScore++;

        if (analysis.getQuestion3().equalsIgnoreCase("yes")) introvertScore++;
        else extrovertScore++;

        if (analysis.getQuestion4().equalsIgnoreCase("yes")) introvertScore++;
        else extrovertScore++;

        if (introvertScore > extrovertScore) {
            return "Recommended: Sci-fic,Comedy,Biography ";
        } else {
            return "Recommended: Action,Horror,Thriller";
        }
    }
}
