package com.xworkz.encapsulation.app;

public class Satellite {
	
	private String type;
	private String name;
	private String color;
	private String uses;
	private int orbit_altitude;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUses() {
		return uses;
	}

	public void setUses(String uses) {
		this.uses = uses;
	}

	public int getOrbit_altitude() {
		return orbit_altitude;
	}

	public void setOrbit_altitude(int orbit_altitude) {
		this.orbit_altitude = orbit_altitude;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return( " type: " + this.type + " name: " + this.name + " color:" + this.color + " uses: " + this.uses + " orbit_altitude: " + this.orbit_altitude );
	}

}