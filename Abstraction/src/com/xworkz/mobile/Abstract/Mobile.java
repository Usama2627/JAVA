package com.xworkz.mobile.Abstract;

public abstract class Mobile {

	public abstract void call();
	public abstract void sendMessage();
	
	public final String operatingSystem() {
		return "Unknown";
	}
	public void batteryInfo() {
		System.out.println("Battery capacity, charging status, etc.");
	}
}
