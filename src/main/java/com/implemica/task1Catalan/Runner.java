package com.implemica.task1Catalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;



public class Runner {
	
	private static Logger log = Logger.getLogger(Runner.class);
	
	public static void main(String [] args) {

		System.out.println("Enter a non-negative number: ");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			int n = Integer.parseInt(br.readLine());
			log.info("For n = " + n + " answer: " + CatalanNumber.findCatalanNumber(n));
			System.out.println("Answer: " + CatalanNumber.findCatalanNumber(n));
			
		} catch (NumberFormatException e) {
			log.error("NumberFormatException: your input does not contain an integer number");
			System.out.println("Your input does not contain an integer number");
		} catch (IOException e) {
			log.error("IOException: I/O error occurs");
			System.out.println("Error with reading your input");
		}

	}

}
