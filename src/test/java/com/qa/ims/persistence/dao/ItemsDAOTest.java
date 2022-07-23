package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemsDAOTest {

	private final ItemsDAO DAO = new ItemsDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-dataitem.sql");

	}

	@Test
	public void testCreate() {
		final Item created = new Item(4L, "Shoe", "15");
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testRead() {
		final long ItemID = 4L;
		assertEquals(new Item(ItemID, "Shoe", "15"), DAO.read(ItemID));
	}

	@Test
	public void testUpdate() {
		final Item updated = new Item(4L, "Sock", "29");
		assertEquals(updated, DAO.update(updated));
	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}

}
