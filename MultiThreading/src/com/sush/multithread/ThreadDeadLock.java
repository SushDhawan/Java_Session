package com.sush.multithread;

public class ThreadDeadLock {

	public static void main(String[] args) {
		 
		final String res1 = "Abc";
		final String res2 = "XYZ";
		
		
		Thread t1 = new Thread() {
			
			public void run() {
				synchronized(res1) {
				System.out.println("Thread1 : locked res1");
		
			try {
				Thread.sleep(100) ;
				}
				catch (Exception e) {}

			synchronized(res2) {
				System.out.println("Thread1 : locked res2");
				}

				}
			}
		};

			Thread t2 = new Thread() {
				public void run() {
					synchronized (res2) {
						System.out.println("Thread2 : locked res2");
						
						try {
							Thread.sleep(100);
						}
						catch (Exception e) {}
						
						synchronized (res1) {
							System.out.println("Thread 2 : locked res1");
						}
					}
				}
			};
			
			t1.start();
			t2.start();
	}
}
