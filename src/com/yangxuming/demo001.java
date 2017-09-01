package com.yangxuming;

import java.lang.reflect.Method;


public class demo001 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.yangxuming.StringDemo");
			Method[] m = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
