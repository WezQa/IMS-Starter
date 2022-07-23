package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long OrderNum = test.OrderNum(10);
		assertEquals(10, OrderNum);

	}

	@Test
	public void testgetOrderNum() {
		Order order = new Order(1L, 1L);
		order.getOrderNum(1);
		assertTrue(order.getOrderNum() == 1);
	}

	@Test
	public void testgetIdD() {
		Order order = new Order(1L, 1L);
		order.getId(1);
		assertTrue(order.getId() == 1);
	}

	@Test
	public void testsetOrderNum() {
		Order order = new Order(1L, 1L);
		order.setOrderNum(1L);
		assertTrue(order.setOrderNum() == 1);
	}

	@Test
	public void testsetIdD() {
		Order order = new Order(1L, 1L);
		order.setId(1L);
		assertTrue(order.setId() == 1L);
	}

}
