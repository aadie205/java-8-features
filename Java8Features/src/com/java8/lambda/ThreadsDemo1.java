package com.java8.lambda;

public class ThreadsDemo1 {

	public static void main(String[] args) {

		Runnable r=new myRunnable();
		Thread th=new Thread(r);
		
		th.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}

class myRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread");
		}
	}
}