package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long OrderNum = test.OrderNum(10);
		assertEquals(10, OrderNum);

	}
}
