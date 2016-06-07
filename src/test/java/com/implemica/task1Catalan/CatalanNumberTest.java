package com.implemica.task1Catalan;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CatalanNumberTest {
	
	private int catalanNumber;
	private int n;

    public CatalanNumberTest(int catalanNumber, int n) {
    	this.catalanNumber = catalanNumber;
        this.n = n;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1, 0 }, { 1, 1 }, { 5, 3 }, { 132, 6 } };
        return Arrays.asList(data);
    }
	
	@Test
	public void testFindCatalanNumber() {
		assertEquals(catalanNumber, CatalanNumber.findCatalanNumber(n));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFindCatalanNumberForNegativeInteger() {
		CatalanNumber.findCatalanNumber(-1);
	}
}
