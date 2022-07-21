package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.utils.DBUtils;

public class OrdersItemDAOTest {

	private final OrdersItemDAO DAO = new OrdersItemDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-dataitem.sql");

	}

	@Test
	public void testDeleteItem() {
		assertEquals(1, DAO.delete(1));
	}

}