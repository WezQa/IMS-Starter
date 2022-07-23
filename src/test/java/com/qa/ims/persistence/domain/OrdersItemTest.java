package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrdersItemTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long Order_Items_ID = test.Order_Items_ID(10);
		assertEquals(10, Order_Items_ID);

	}

	@Test
	public void testgetOrder_Items_ID() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.getOrder_Items_ID(1);
		assertTrue(ordersitem.getOrder_Items_ID() == 1);

	}

	@Test
	public void testgetOrderNum() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.getOrderNum(1);
		assertTrue(ordersitem.getOrderNum() == 1);

	}

	@Test
	public void testgetItemID() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.getItemID(1);
		assertTrue(ordersitem.getItemID() == 1);

	}

	@Test
	public void testgetTotal() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.getTotal(1);
		assertTrue(ordersitem.getTotal() == 1);

	}

	@Test
	public void testgetQuantity() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.getQuantity(1);
		assertTrue(ordersitem.getQuantity() == 1);
	}

	@Test
	public void testsetOrder_Items_ID() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.setOrder_Items_ID(1);
		assertTrue(ordersitem.setOrder_Items_ID() == 1);

	}

	@Test
	public void testsetOrderNum() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.setOrderNum(1L);
		assertTrue(ordersitem.setOrderNum() == 1);

	}

	@Test
	public void testsetItemID() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.setItemID(1);
		assertTrue(ordersitem.setItemID() == 1);

	}

	@Test
	public void testsetTotal() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.setTotal(1);
		assertTrue(ordersitem.setTotal() == 1);

	}

	@Test
	public void testsetQuantity() {
		OrdersItem ordersitem = new OrdersItem(0, 0, 0, 0);
		ordersitem.setQuantity(1);
		assertTrue(ordersitem.setQuantity() == 1);
	}

}