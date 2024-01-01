package com.java8.lambda;

public class ThreadsDemo2 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
				for(int i=0;i<10;i++)
					System.out.println("child Thread");
		};
		Thread th= new Thread(r);
		th.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
		}

	}

}


