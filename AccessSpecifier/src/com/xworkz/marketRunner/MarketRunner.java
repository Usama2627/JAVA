package com.xworkz.marketRunner;

//import com.xworkz.market.base.Market;
import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket sm = new SuperMarket();
		sm.buy(); 
		//sm.sell(); //The method sell() from the type Market is not visible

		OnlineMarket om = new OnlineMarket();
		//om.buy(); //The method sell() from the type Market is not visible
		om.sell(); 
	}

}

