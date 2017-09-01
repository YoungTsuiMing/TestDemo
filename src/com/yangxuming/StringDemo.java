package com.yangxuming;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b' };
		String hellostring = new String(helloArray);
		System.out.println(hellostring);

		int hellolength = hellostring.length();
		System.out.println("hellostring ³¤¶È " + hellolength);
		System.out.println(getString("Jacky!"));
	}

	public static String getString(String tmp) {
		StringBuffer str = new StringBuffer();
		str.append(tmp);
		str.append("I am a superman!");
		return str.toString();
	}
}
