package com.threadexample;

public class OddEvenThread {
	public synchronized void odd() {
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
	}
	public synchronized void even() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		OddEvenThread oe=new OddEvenThread();
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.odd();
			}
		});
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.even();
			}
		});
		t1.start();
		t2.start();
	}

}
