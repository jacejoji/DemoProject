package outer;

import pack.Test;

public class Demo extends Test{

	public static void main(String[] args) {
       Test.add(10, 34);
       Demo t=new Demo();
       t.sub(20, 10);
       System.out.println(t.mul(29, 30));
	}

}
