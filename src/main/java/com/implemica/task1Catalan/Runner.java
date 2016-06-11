package com.implemica.task1Catalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 * @author Viktoriia Silenko
 */

public class Runner {

	private static Logger log = Logger.getLogger(Runner.class);

	public static void main(String[] args) {

		System.out.println(MessageConstants.MSG_NUMBER_INPUT);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			long n = Long.parseLong(br.readLine());
			log.info(String.format(MessageConstants.MSG_ANSWER_FOR_N, n, CatalanNumber.findCatalanNumber(n)));
			System.out.println(String.format(MessageConstants.MSG_ANSWER, CatalanNumber.findCatalanNumber(n)));

		} catch (NumberFormatException e) {
			log.error(MessageConstants.MSG_NOT_NUMBER_ERROR_WITH_EXCEPTION_TYPE);
			System.out.println(MessageConstants.MSG_NOT_NUMBER_ERROR);
			
		} catch (IOException e) {
			log.error(MessageConstants.MSG_IO_ERROR_WITH_EXCEPTION_TYPE);
			System.out.println(MessageConstants.MSG_IO_ERROR);
		}

	}

}
