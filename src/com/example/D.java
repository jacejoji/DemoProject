package com.example;
class A  extends Tiger implements Animal1,Animal2{
	A(){
		System.out.println("Default of A");
	}
	A(int a){
		System.out.println("Parameterized of A"+a);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		 System.out.println("Eating");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
	}
}
class B extends A{
	B(){
		super(10);
		System.out.println("Default of B" );
	}
	B(int a){
		System.out.println("Parameterized of B"+a);
	}
}
class C extends B{
	C(){
		System.out.println("Default of C");
	}
	C(int a){
		super(10);
		System.out.println("Parameterized of C"+a);
	}
}
public class D extends C{
	D(){
		super(10);
		System.out.println("Default of D");
	}
	D(int a){
		System.out.println("Parameterized of D"+a);
	}
	public static void main(String[] args) {
		new D();
		new D(10);
		C c=new D();
		c.eat();
		c.run();
		c.sleep();
	}

}
