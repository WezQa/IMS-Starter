package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.DBUtils;

public class CustomerDAOTest {

	private final CustomerDAO DAO = new CustomerDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test
	public void testCreate() {
		final Customer created = new Customer(4L, "Chris", "Redfield");
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testRead() {
		final long id = 1L;
		assertEquals(new Customer(id, "Chris", "Redfield"), DAO.read(id));
	}

	@Test
	public void testUpdate() {
		final Customer updated = new Customer(6L, "Chris", "Redfield");
		assertEquals(updated, DAO.update(updated));
	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}

	@Test
	public void testReadAll() {
		List<Customer> expected = new ArrayList<>();
		expected.add(new Customer(4L, "Chris", "Redfield"));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Customer(4L, "Chris", "Redfield"), DAO.readLatest());
	}

}
