package com.example.moviefinder.Entity;
import jakarta.persistence.Entity;

@Entity
public class Suggestion {
    private String i_movies;
    private String e_movies;

    public Suggestion(String i_movies, String e_movies) {
        this.i_movies = i_movies;
        this.e_movies = e_movies;
    }
    public String getI_movies(){
        return i_movies;
    }
    public void setI_movies(String i_movies){
        this.i_movies = i_movies;
    }
    public String getE_movies(){
        return e_movies;
    }
    public void setE_movies(String e_movies){
        this.e_movies = e_movies;
    }
    
    
}
