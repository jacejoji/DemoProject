package com.example;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		EmployeeSerializable e=new EmployeeSerializable( 2039884,"Rohit",50000);
		FileOutputStream fos=new FileOutputStream("D:\\java\\testing1\\e.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		FileInputStream fis=new FileInputStream("D:\\java\\testing1\\e.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		EmployeeSerializable e1=(EmployeeSerializable)ois.readObject();
		System.out.println(e1.getEid()+" "+e1.getEname()+" "+e1.getEsal());
		oos.close();
		fos.close();
		ois.close();
		fis.close();
	}

}
