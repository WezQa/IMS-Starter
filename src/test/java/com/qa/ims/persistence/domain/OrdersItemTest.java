package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrdersItemTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long Order_Items_ID = test.Order_Items_ID(10);
		assertEquals(10, Order_Items_ID);

	}
}
