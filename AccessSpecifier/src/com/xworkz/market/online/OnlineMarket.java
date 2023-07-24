package com.xworkz.market.online;

import com.xworkz.market.base.Market;

public class OnlineMarket extends Market{

	@Override
	public void sell() {

		System.out.println("Overriding sell method in OnlineMarket");
	}

}
