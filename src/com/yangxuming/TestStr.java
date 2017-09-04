package com.yangxuming;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		sb.append("www.baidu.com!");
		sb.insert(sb.length(),"fuck you!");
		System.out.println(sb);	
	}
}
