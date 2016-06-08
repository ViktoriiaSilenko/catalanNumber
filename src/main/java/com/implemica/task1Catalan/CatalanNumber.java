package com.implemica.task1Catalan;

/**
 * @author Viktoriia Silenko
 */

public class CatalanNumber {

	/**
	 * Calculate C(n)- number of correct sequences consist of brackets with
	 * length 2n (with n open and n close brackets): C(n) = C(0)*C(n-1) +
	 * C(1)*C(n-2) + C(2)*C(n-3) +...+ C(n-2)*C(1) + C(n-1)*C(0).
	 * 
	 * Examples: n = 0 empty => C(0) = 1 n = 1 () => C(1) = 1 n = 2 ()() , (())
	 * => C(2) = 2 n = 3 ((())) , (()()) , (())() , ()(()) , ()()() => C(3) = 5
	 * 
	 * @param n
	 *            - number of open and close bracket
	 */
	public static int findCatalanNumber(int n) {

		if (n < 0) {
			throw new IllegalArgumentException(String.format(MessageConstants.MSG_INVALID_NUMBER_INPUT, n));
		}

		int catalan[] = new int[n + 1];

		catalan[0] = 1; // void sequence

		for (int m = 1; m <= n; m++) { // Calculate catalan[m] , m = 1...n

			for (int k = 0; k < m; k++)
				catalan[m] += catalan[k] * catalan[m - 1 - k];
		}
		return catalan[n];
	}

}
