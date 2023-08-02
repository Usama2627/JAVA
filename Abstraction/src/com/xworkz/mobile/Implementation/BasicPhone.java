package com.xworkz.mobile.Implementation;

import com.xworkz.mobile.Abstract.Mobile;

public class BasicPhone extends Mobile {

	@Override
	public void call() {
		System.out.println("Making a call using the basic phone");
	}

	@Override
	public void sendMessage() {
		System.out.println("Sending a message using the basic phone");
	}
}
