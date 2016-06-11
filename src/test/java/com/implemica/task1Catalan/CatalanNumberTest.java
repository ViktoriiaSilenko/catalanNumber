package com.implemica.task1Catalan;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CatalanNumberTest {
	
	private BigInteger catalanNumber;
	private long n;

    public CatalanNumberTest(BigInteger catalanNumber, int n) {
    	this.catalanNumber = catalanNumber;
        this.n = n;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { BigInteger.valueOf(1), 0 }, { BigInteger.valueOf(1), 1 }, { BigInteger.valueOf(5), 3 }, 
        	{ BigInteger.valueOf(132), 6 }, { BigInteger.valueOf(24466267020L), 21 } };
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
	
	@Test (expected = IllegalArgumentException.class)
	public void testFindCatalanNumberForMaxValue() {
		CatalanNumber.findCatalanNumber((Long.MAX_VALUE+2)/4);
	}
}
