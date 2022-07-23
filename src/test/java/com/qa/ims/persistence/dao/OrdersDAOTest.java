package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrdersDAOTest {

	private final OrdersDAO DAO = new OrdersDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-dataitem.sql");

	}

	@Test
	public void testCreate() {
		final Order created = new Order(4L, 4L);
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testRead() {
		final long OrderNum = 1L;
		assertEquals(new Order(OrderNum, 2L), DAO.read(OrderNum));
	}

	@Test
	public void testUpdate() {
		final Order updated = new Order(2L, 2L);
		assertEquals(updated, DAO.update(updated));
	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}

}