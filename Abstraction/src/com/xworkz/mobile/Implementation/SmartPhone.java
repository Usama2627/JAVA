package com.xworkz.mobile.Implementation;

import com.xworkz.mobile.Abstract.Mobile;

public class SmartPhone extends Mobile {

	@Override
	public void call() {
		System.out.println("Making a call using the smartphone");
	}

	@Override
	public void sendMessage() {
		System.out.println("Sending a message using the smartphone");
	}

	public void playMusic() {
		System.out.println("Playing music on the smartphone");
	}
}
