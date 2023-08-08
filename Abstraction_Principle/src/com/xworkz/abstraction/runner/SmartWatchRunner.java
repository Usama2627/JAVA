package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.SmartWatch.AsusSmartWatch;
import com.xworkz.abstraction.app.SmartWatch.SmartWatch;
import com.xworkz.abstraction.app.SmartWatch.Thor;

public class SmartWatchRunner {

	public static void main(String[] args) {

		System.out.println("Running main...\n");

		SmartWatch smartWatch = new AsusSmartWatch();

		Thor t = new Thor(smartWatch);
		t.getShowTime();

	}

}
