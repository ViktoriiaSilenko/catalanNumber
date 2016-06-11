package com.implemica.task1Catalan;

import java.math.BigInteger;

/**
 * @author Viktoriia Silenko
 */

public class CatalanNumber {

	/**
	 * Calculate C(n)- number of correct sequences consist of brackets with
	 * length 2n (with n open and n close brackets), using Catalan number: 
	 * C(n+1) = C(n)*(4*n+2)/(n+2)
	 * 
	 * Examples: n = 0 empty => C(0) = 1 
	 * n = 1 () => C(1) = 1 
	 * n = 2 ()() , (()) => C(2) = 2 
	 * n = 3 ((())) , (()()) , (())() , ()(()) , ()()() => C(3) = 5
	 * ...
	 * @param n - number of open and close bracket
	 */
	public static BigInteger findCatalanNumber(int n) {

		if (n < 0 || n >= Integer.MAX_VALUE) {
			throw new IllegalArgumentException(String.format(MessageConstants.MSG_INVALID_NUMBER_INPUT, n));
		}

		BigInteger catalan[] = new BigInteger[n+1];

		catalan[0] = BigInteger.ONE; // void sequence
		
		for (int m = 0; m < n; m++) { // Calculate catalan[m] , m = 1...n
			catalan[m+1] = catalan[m].multiply(BigInteger.valueOf(4*m+2)).divide(BigInteger.valueOf(m+2));
		}
		
		return catalan[n];
	}

}
