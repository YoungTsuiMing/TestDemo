package com.yangxuming;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog = new Dog();
        dog.move();
	}

}

class Animal {
	public void move() {
		System.out.println("��������ƶ�");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("�������ܺ���");
	}
}