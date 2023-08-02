package com.xworkz.mobile.runner;

import com.xworkz.mobile.Abstract.Mobile;
import com.xworkz.mobile.Implementation.BasicPhone;
import com.xworkz.mobile.Implementation.SmartPhone;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile = new SmartPhone();
		mobile.batteryInfo();
		mobile.call();
		mobile.sendMessage();

		SmartPhone smartphone = new SmartPhone();
		smartphone.batteryInfo();
		smartphone.call();
		smartphone.sendMessage();
		smartphone.playMusic();

		Mobile basicPhone = new BasicPhone();
		basicPhone.batteryInfo();
		basicPhone.call();
		basicPhone.sendMessage();
	}
}

