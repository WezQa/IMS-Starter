package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.OrdersItem;
import com.qa.ims.utils.DBUtils;

public class OrdersItemDAOTest {

	private final OrdersItemDAO DAO = new OrdersItemDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-dataitem.sql");

	}

	@Test
	public void testCreate() {
		final OrdersItem created = new OrdersItem(2L, 2L, 2L, 12.99, 12);
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testRead() {
		final long Order_Items_ID = 4L;
		assertEquals(new OrdersItem(Order_Items_ID, 2L, 2L, 12.99, 12), DAO.read(Order_Items_ID));
	}

	@Test
	public void testUpdate() {
		final OrdersItem updated = new OrdersItem(2L, 2L, 2L, 12.99, 12);
		assertEquals(updated, DAO.update(updated));
	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}

	@Test
	public void testReadAll() {
		List<OrdersItem> expected = new ArrayList<>();
		expected.add(new OrdersItem(2L, 2L, 2L, 12.99, 12));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new OrdersItem(2L, 2L, 2L, 12.99, 12), DAO.readLatest());
	}

}
