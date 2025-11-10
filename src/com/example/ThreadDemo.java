package com.example;

public class ThreadDemo extends Thread {
	public static ThreadDemo td;
	public static void main(String[] args) {
		td=new ThreadDemo();
		ThreadDemo2 t3=new ThreadDemo2();
	Thread 	t2=new Thread(t3);
	ThreadDemo	t1=new ThreadDemo();
	Runnable r=()->{
		System.out.println(Thread.currentThread().getName()+" Running with priority:"+Thread.currentThread().getPriority());
	};
	Runnable r2=()->{
		System.out.println("Running 2nd ");
	};
	t2.setName("Activated Thread");
	t2.setPriority(MAX_PRIORITY);
	t2.start();
	new Thread(r).start();
	new Thread(r2).start()	;
	new Thread(t3).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			if(i==2)
				suspend();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
