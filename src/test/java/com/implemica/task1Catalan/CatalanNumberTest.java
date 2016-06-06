package com.implemica.task1Catalan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CatalanNumberTest {
	
	private final CatalanNumber catalanNumber = new CatalanNumber();
	
	@Test
	public void testFindCatalanNumber() {
		assertEquals(1, catalanNumber.findCatalanNumber(0));
		assertEquals(1, catalanNumber.findCatalanNumber(1));
		assertEquals(5, catalanNumber.findCatalanNumber(3));
		assertEquals(132, catalanNumber.findCatalanNumber(6));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFindCatalanNumberForNegativeInteger() {
		catalanNumber.findCatalanNumber(-1);
	}
}
