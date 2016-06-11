// Constant utility class
package com.implemica.task1Catalan;

public class MessageConstants {
	
	private MessageConstants() { }  // Prevents instantiation

	public static final String MSG_NUMBER_INPUT = "Enter a non-negative number < " + Integer.MAX_VALUE;
	public static final String MSG_ANSWER_FOR_N = "For n = %s answer: %s";
	public static final String MSG_ANSWER = "Answer: %s";
	public static final String MSG_NOT_NUMBER_ERROR_WITH_EXCEPTION_TYPE = "NumberFormatException: your input does not contain an integer number";
	public static final String MSG_NOT_NUMBER_ERROR = "Your input does not contain an integer number";
	public static final String MSG_IO_ERROR_WITH_EXCEPTION_TYPE = "IOException: I/O error occurs";
	public static final String MSG_IO_ERROR = "Error with reading your input";
	public static final String MSG_INVALID_NUMBER_INPUT = "n = %s is not appropriate, because n cannot be negative and cannot be greater than " + (Integer.MAX_VALUE-1);

}
