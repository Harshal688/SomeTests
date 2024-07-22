package com.blue.Shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MobileShopTest {
	
	@Test
	public void testgetPrice() {
		
		//Created a mock object.
		MobileShop shopee = mock(MobileShop.class);
		
		//Stubbing
		when(shopee.getPrice("Iphone 13")).thenReturn(999.90);
		
		assertEquals(999.90, shopee.getPrice("Iphone 13"));
		
		
		
		
	}

}
