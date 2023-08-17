package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class TheatreDTO implements Serializable{

	private String theatreName;
	private String movieName;
	private String owner;
	private boolean snackesAllowed;
	private String location;
	public TheatreDTO(){
		System.out.println("Running no-args const in TheatreDTO");
	}

	public TheatreDTO(String theatreName, String movieName, String owner, boolean snackesAllowed,String location) {
		super();
		this.theatreName = theatreName;
		this.movieName = movieName;
		this.owner = owner;
		this.snackesAllowed = snackesAllowed;
		this.location=location;
	}

	@Override
	public String toString() {
		return "TheatreDTO [theatreName=" + theatreName + ", movieName=" + movieName + ", owner=" + owner + ", snackesAllowed="
				+ snackesAllowed + ", location=" + location + "]";
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theaterName) {
		this.theatreName = theaterName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isSnackesAllowed() {
		return snackesAllowed;
	}
	public void setSnackesAllowed(boolean snackes) {
		this.snackesAllowed = snackesAllowed;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}

