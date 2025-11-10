package com.example;

public class DemoRunnable implements Runnable {
	public static void main(String[] args) {
		DemoRunnable d=new DemoRunnable() ;
		Thread t=new Thread(d);
		t.start();
		Thread t1=new Thread(d);
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
