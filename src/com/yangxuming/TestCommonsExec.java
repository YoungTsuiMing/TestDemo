package com.yangxuming;

import java.io.ByteArrayOutputStream;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;

public class TestCommonsExec {

	public static void main(String[] args) {
		ping("121.40.158.33");
	}

	public static String ping(String ip) {

		try {

			String command = "ping " + ip;

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			ByteArrayOutputStream errorStream = new ByteArrayOutputStream();

			CommandLine commandline = CommandLine.parse(command);

			DefaultExecutor exec = new DefaultExecutor();

			exec.setExitValues(null);

			PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);

			exec.setStreamHandler(streamHandler);

			exec.execute(commandline);

			String out = outputStream.toString("gbk");

			String error = errorStream.toString("gbk");

			return out + error;

		} catch (Exception e) {

			return e.toString();

		}

	}

}
