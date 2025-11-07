package com.example;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
public class DateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(d));
		String str="22/11/2029";
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		LocalDate dl=LocalDate.now();
		System.out.println(dl);
		
		//Date dd=sdf.parse(str);
		//System.out.println(dd.getDate());
	}

}
