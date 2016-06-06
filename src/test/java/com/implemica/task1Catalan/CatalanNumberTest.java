package com.implemica.task1Catalan;

import static org.junit.Assert.*;
import org.junit.Test;

public class CatalanNumberTest {
	
	@Test
	public void testFindCatalanNumber() {
		assertEquals(1, CatalanNumber.findCatalanNumber(0));
		assertEquals(1, CatalanNumber.findCatalanNumber(1));
		assertEquals(5, CatalanNumber.findCatalanNumber(3));
		assertEquals(132, CatalanNumber.findCatalanNumber(6));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFindCatalanNumberForNegativeInteger() {
		CatalanNumber.findCatalanNumber(-1);
	}
}
