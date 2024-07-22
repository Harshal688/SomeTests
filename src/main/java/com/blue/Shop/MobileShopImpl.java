package com.blue.Shop;

import java.util.HashMap;
import java.util.Map;

public class MobileShopImpl implements MobileShop {
	
	private Map<String, Double> phonePrices;
	
	public MobileShopImpl() {
		phonePrices = new HashMap<>();
		
		phonePrices.put("Iphone 13", 999.90);
		
		phonePrices.put("S23", 899.90);
		
		
	}
	
	@Override
	public double getPrice(String phoneName) {
		return phonePrices.getOrDefault(phoneName, 0.0);
	}

	

}
