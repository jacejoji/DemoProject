package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File f=new File("D:\\java\\testing1");
//		File f2=new File("D:\\java\\testing1\\a.txt");
//		File f3=new File("D:\\java\\testing1\\c.txt");
//		f.mkdir();
//		f2.createNewFile();
//		f2.renameTo(f3);
//		System.out.println(f.exists());
FileOutputStream fos=new FileOutputStream("D:\\java\\testing1\\c.txt");
String str="Welcome to UST Global";
byte b[]=str.getBytes();
fos.write(b);
System.out.println("Written data");
FileInputStream fis=new FileInputStream("D:\\java\\testing1\\c.txt");
int i=0;
while((i=fis.read())!=-1)
System.out.print((char)i);
FileReader fr=new FileReader("D:\\java\\testing1\\c.txt");
System.out.println("\n");
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
fis.close();
fos.close();
	}

}
