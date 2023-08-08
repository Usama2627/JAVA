package com.xworkz.abstraction.app.SmartWatch;

public class Thor {

	private SmartWatch smartWatch;

	public Thor(SmartWatch smartWatch) {
		super();
		this.smartWatch = smartWatch;
	}

	public void getShowTime() {
		if (smartWatch != null) {
			System.out.println("smartWatch is not null, can proceed");
			this.smartWatch.showTime();
		}
		else {
			System.err.println("smartWatch is null, stop");
		}
	}

}
