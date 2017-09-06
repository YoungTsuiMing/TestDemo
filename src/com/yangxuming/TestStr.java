package com.yangxuming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestStr {

	private static Logger logger = LogManager.getLogger("TestStr");

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("www.baidu.com!");
		sb.insert(sb.length(), "fuck you!");
		System.out.println(sb);

		logger.trace("Entering application.");
		logger.error("Didn't do it.");
		logger.trace("Exiting application.");

	}
}
