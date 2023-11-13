package com.dev.buildtalent.pojo;

public class Movie {

	public String actor;
	public String movieName;
	public int publishedYear;
	
	
	public Movie(String actor, String movieName, int publishedYear) {
		super();
		this.actor = actor;
		this.movieName = movieName;
		this.publishedYear = publishedYear;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor + ", movieName=" + movieName + ", publishedYear=" + publishedYear + "]";
	}
	
}
