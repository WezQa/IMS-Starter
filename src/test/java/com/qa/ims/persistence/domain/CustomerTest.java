package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long id = test.id(10);
		assertEquals(10, id);

	}

	@Test
	public void testgetId() {
		Customer customer = new Customer(1L, "", "");
		customer.getId(1);
		assertTrue(customer.getId() == 1);

	}

	@Test
	public void testgetItem() {
		Customer customer = new Customer(1L, "", "");
		customer.getFirstName("John");
		assertTrue(customer.getFirstName() == "John");
	}

	@Test
	public void testgetPrice() {
		Customer customer = new Customer(1L, "", "");
		customer.getSurname("Smith");
		assertTrue(customer.getSurname() == "Smith");
	}

	@Test
	public void testsetId() {
		Customer customer = new Customer(1L, "", "");
		customer.setId(1L);
		assertTrue(customer.setId() == 1);

	}

	@Test
	public void testsetItem() {
		Customer customer = new Customer(1L, "", "");
		customer.setFirstName("John");
		assertTrue(customer.setFirstName() == "John");
	}

	@Test
	public void testsetPrice() {
		Customer customer = new Customer(1L, "", "");
		customer.setSurname("Smith");
		assertTrue(customer.setSurname() == "Smith");
	}

	@Test
	public void testHashcode() {

		System.out.println("Inside testNullHashCode()");

		assertEquals(0, hashCode());

	}
}
