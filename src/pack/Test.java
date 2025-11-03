
package pack;

public class Test {
	protected int a=100;

public static void add(int x,int y)

{

System.out.println("The addition of "+x+" and "+y+" is "+(x+y));

}

protected void sub(int x,int y)

{

System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));

}

public int mul(int x,int y)

{

return(x*y);

}

public static void main(String[] args) {

Test.add(22,33);

Test c=new Test();

c.sub(33,11);

System.out.println(c.mul(22, 2));

}

}