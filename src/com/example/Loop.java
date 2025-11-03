package com.example;

public class Loop {
	Loop(){
		this("Hello");
		System.out.println("Hello from constructor!!");	
		this.work();
	}
	int x=22;
	void display(int x) {
		System.out.println(this.x);
	}
	void work() {
		System.out.println("!!Working a loop......................!!");
		}
	Loop(int i){
		System.out.println("Hello from constructor!!");
	}
	Loop(String s){
		System.out.println("Hello from constructor!!");
	}

	public static void main(String[] args) {
		Loop l=new Loop();
		new Loop().work();
		First:
		for(int i=0;i<5;i++)
		{
			System.out.println("First block");
			System.out.println("Second block");
			if(i==3)
				break  First;
		}
		l.display(10);
	}
	

}
