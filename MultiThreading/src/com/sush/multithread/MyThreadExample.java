package com.sush.multithread;


class Table {
	
	void printTable(int n)
	{
		
		for(int i =1;i<=8;i++)
			System.out.println(n*i);
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
   }
}


public class MyThreadExample {

	public static void main(String[] args) {
		
		final Table obj = new Table();
		Thread t1 = new Thread() {
			public void run() 
			{
				obj.printTable(7);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() 
			{
				obj.printTable(10);
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
