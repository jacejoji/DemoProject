package com.example;


public class StrDemo {

	public static void main(String[] args) {
		String st=new String("Hello");
		System.out.println(st.charAt(1));
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
		rev+=st.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.repeat(4));
		System.out.println(rev.replace('e', 'j'));
		System.out.println(rev.toUpperCase());
		rev=rev.concat(" How are you?").concat(st);
		String a[]=rev.split(" ");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		StringBuffer s=new StringBuffer("A large text of text");
		s.reverse();
		System.out.println(s);
		String str=String.valueOf(s);
		String str1=s.toString();
		int i=10;
		String j=String.valueOf(i);
		System.out.println(s.append(" Hello User!"));
		
	}

}
