package com.bitwise.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie {
	private String movieName;
	private String theater;
	private String totalSeats;
	ArrayList<MoviShow> shows= new ArrayList<MoviShow>();
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	public void addMovieShow(Date startTime,Date endTime){
	
			
	}
	
	
}