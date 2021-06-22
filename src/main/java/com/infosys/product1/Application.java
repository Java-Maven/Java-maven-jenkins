package com.infosys.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class); 

	public static void main(String[] args) 
	{
		logger.debug("debug msg");
		logger.info("info msg");
		logger.warn("warning msg");
		logger.error("error msg");
	}
}
