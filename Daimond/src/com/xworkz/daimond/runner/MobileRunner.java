package com.xworkz.daimond.runner;

import com.xworkz.daimond.mobile.AwesomeMobile;
import com.xworkz.daimond.mobile.AndroidPhone;
import com.xworkz.daimond.mobile.FeaturePhone;
import com.xworkz.daimond.mobile.Smartphone;

public class MobileRunner {

	public static void main(String[] args) {

		System.out.println("Running main in MobileRunner.....\n");

		Smartphone sp = new AndroidPhone();
		sp.call();
		sp.browseInternet();
		System.out.println("----------------------------------");

		FeaturePhone fp = new AndroidPhone();
		fp.call();
		fp.sendText();
		System.out.println("----------------------------------");

		AwesomeMobile am = new AndroidPhone();
		am.call();
		am.browseInternet();
		am.sendText();
		System.out.println("----------------------------------");

		AndroidPhone ap = new AndroidPhone();
		ap.call();
		ap.browseInternet();
		ap.sendText();
	}
}
