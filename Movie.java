package com.java.encapsulation;

public class Movie {
	
	private String title;
	private String director;
	private int releaseYear;
	private String genre;
    private int duration; 
	
	
	
	public Movie(){
		System.out.println("no argumnt");
	}
	
	
	//set
	public void settitle(String title) {
		this.title=title;
	}
	public void setdirector(String director) {
		this.director=director;
	}
	public void setreleaseYear(int releaseYear) {
		this.releaseYear=releaseYear;
	}
	
	public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    
    //get
	public String gettitle() {
		return title;
		
	}
	
	public String getdirector() {
		return director;
	
	}
	
	public int getreleaseYear() {
		return releaseYear;
	
	}
	public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
    @Override
    public String toString() {
    	System.out.println("toString() invoke");
    	return this.title+this.director+this.releaseYear+this.genre+this.duration;
    }
	
}
