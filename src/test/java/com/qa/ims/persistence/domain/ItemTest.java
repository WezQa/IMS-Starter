/**
 * 
 */
package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

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
}