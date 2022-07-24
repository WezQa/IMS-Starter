/**
 * 
 */
package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 
 *
 */
public class ItemTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long ItemID = test.ItemID(10);
		assertEquals(10, ItemID);

	}

	@Test
	public void testitem() {
		JunitTesting test = new JunitTesting();
		String Item = test.Item("Sock");
		assertEquals("Sock", Item);

	}

	@Test
	public void testprice() {
		JunitTesting test = new JunitTesting();
		String Price = test.Price("100");
		assertEquals("100", Price);
	}

	@Test
	public void testgetItemID() {
		Item item = new Item(1L, "", "");
		item.getItemID(1);
		assertTrue(item.getItemID() == 1);

	}

	@Test
	public void testgetItem() {
		Item item = new Item(1L, "Sock", "");
		item.getItem("Sock");
		assertTrue(item.getItem() == "Sock");
	}

	@Test
	public void testgetPrice() {
		Item item = new Item(1L, "Sock", "99");
		item.getPrice("99");
		assertTrue(item.getPrice() == "99");
	}

	@Test
	public void testsetItemID() {
		Item item = new Item(1L, "", "");
		item.setItemID(1L);
		assertTrue(item.setItemID() == 1);

	}

	@Test
	public void testsetItem() {
		Item item = new Item(1L, "Sock", "");
		item.setItem("Sock");
		assertTrue(item.setItem() == "Sock");
	}

	@Test
	public void testsetPrice() {
		Item item = new Item(1L, "Sock", "99");
		item.setPrice("99");
		assertTrue(item.setPrice() == "99");
	}

	@Test

	public void testHashcode() {

		System.out.println("Inside testNullHashCode()");

		assertEquals(0, hashCode());

	}

}
