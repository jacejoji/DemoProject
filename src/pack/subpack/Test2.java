package pack.subpack;

import pack.Test;

public class Test2 extends Test{

	public static void main(String[] args) {
		Test.add(10, 20);
		Test2 t=new Test2();
		t.sub(20, 10);
		System.out.println(t.mul(29, 30));
	}

}
