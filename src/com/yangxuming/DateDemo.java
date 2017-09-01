package com.yangxuming;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt.toString());
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(dt));

		String[] arrlist = { "Jack", "Mike", "Young" };
		for (String arr : arrlist) {
			System.out.println(arr);
		}
	}
}
