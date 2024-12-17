package com.java.encapsulation.movieRun;

import com.java.encapsulation.Movie;

public class Runmovie {
public static void main(String[] args) {
	
	Movie movie = new Movie();
	
    movie.settitle("Emily in paris"); 
    System.out.println("Title: " + movie.gettitle());
    
    movie.setdirector("Lekha"); 
    System.out.println("Director: " + movie.getdirector());
    
    movie.setreleaseYear(2002); 
    System.out.println("year: " + movie.getreleaseYear());
    
    movie.setGenre("Drama");
    System.out.println("Genre: " + movie.getGenre());
    
    movie.setDuration(120);
    System.out.println("Duration: " + movie.getDuration());
    
    System.out.println(movie);

}

}
