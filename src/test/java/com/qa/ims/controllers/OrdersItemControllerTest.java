package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrdersItemController;
import com.qa.ims.persistence.dao.OrdersItemDAO;
import com.qa.ims.persistence.domain.OrdersItem;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrdersItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrdersItemDAO dao;

	@InjectMocks
	private OrdersItemController controller;

	@Test
	public void testCreate() {
		final long OrderNum = 1L, ItemID = 1L;
		final double Total = 12.99, Quantity = 12;
		final OrdersItem created = new OrdersItem(OrderNum, ItemID, Total, Quantity);

		Mockito.when(utils.getLong()).thenReturn(OrderNum, ItemID);
		Mockito.when(utils.getDouble().Return(Total, Quantity));
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<OrdersItem> orders_items = new ArrayList<>();
		orders_items.add(new OrdersItem(1L, 1L, 19.99, 9));

		Mockito.when(dao.readAll()).thenReturn(orders_items);

		assertEquals(orders_items, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		OrdersItem updated = new OrdersItem(1L, 1L, 1L, 19.99, 9);

		Mockito.when(this.utils.getLong()).thenReturn(1L, 1L, 1L);
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getTotal(), updated.getQuantity());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(2)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long Order_Items_ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(Order_Items_ID);
		Mockito.when(dao.delete(Order_Items_ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(Order_Items_ID);
	}

}
