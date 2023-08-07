package com.xworkz.daimond.mobile;

public class AndroidPhone implements AwesomeMobile {

	@Override
	public void call() {
		System.out.println("Invoking call in AndroidPhone");
	}

	@Override
	public void browseInternet() {
		System.out.println("Invoking browseInternet in AndroidPhone");
	}

	@Override
	public void sendText() {
		System.out.println("Invoking sendText in AndroidPhone");
	}
}
