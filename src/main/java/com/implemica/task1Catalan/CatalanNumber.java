package com.implemica.task1Catalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.BasicConfigurator; 
import org.apache.log4j.Logger;


public class CatalanNumber {
	
	private static Logger log = Logger.getLogger(CatalanNumber.class); 

	/**
     * Calculate C(n)- number of correct sequences consist of brackets with length 2n (with n open and n close brackets):
     * C(n) = C(0)*C(n-1) + C(1)*C(n-2) + C(2)*C(n-3) +...+ C(n-2)*C(1) + C(n-1)*C(0).
     * 
     * Examples:
     * n = 0 empty => C(0) = 1
     * n =  1 () => C(1) = 1 
     * n = 2 ()() , (()) => C(2) = 2
     * n = 3 ((())) , (()()) , (())() , ()(()) , ()()() =>  C(3) = 5
     * 
     * @param n - number of open and close bracket
     */
	public int findCatalanNumber(int n) {
		
		if (n < 0) {
			throw new IllegalArgumentException("n = " + n + " is not appropriate, because n cannot be negative");
		}
		
		int catalan[] = new int [n+1]; 
	
		catalan[0] = 1; // void sequence
		
		for (int m = 1; m <= n; m++) { // Calculate catalan[m] , m = 1...n
			
		    for (int k = 0; k < m; k++) 
		    	catalan[m] += catalan[k] * catalan[m-1-k]; 
		} 
		return catalan[n]; 
	}
	
	public static void main(String [] args) {
		
		 
		BasicConfigurator.configure(); //BasicConfigurator use ConsoleAppender and PatternLayout for all loggers.
		
		CatalanNumber catalan = new CatalanNumber();

		log.info("Enter a non-negative number: ");
	
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			int n = Integer.parseInt(br.readLine());
			log.info("Answer: " + catalan.findCatalanNumber(n));
			
		} catch (NumberFormatException e) {
			log.error("Error: your input does not contain an integer number");
		} catch (IOException e) {
			log.error("I/O error occurs");
		}

	}

}
