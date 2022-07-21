package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		long id = test.id(10);
		assertEquals(10, id);
		
	}

	

	
	
	
}
