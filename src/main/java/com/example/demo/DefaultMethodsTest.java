package com.example.demo;


public class DefaultMethodsTest {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executing Thread " + Thread.currentThread().getName());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executing Thread " + Thread.currentThread().getName());
			}
		});
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.start();
		t2.start();
		System.out.println("Executing Main thread" + Thread.currentThread().getName());
		
		System.out.println("Completed Thread " + Thread.currentThread().getName());
	}
	
}
