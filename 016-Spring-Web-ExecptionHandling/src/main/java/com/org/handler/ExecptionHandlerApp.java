package com.org.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Global handler
@ControllerAdvice
public class ExecptionHandlerApp {

	private Logger logger = LoggerFactory.getLogger(ExecptionHandlerApp.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handleExp(Exception e) {
		String message = e.getMessage();
		logger.error(message);
		return "errorPage";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNPE(NullPointerException ne) {
		String message = ne.getMessage();
		logger.error(message);
		return "errorPage";
	}
}
