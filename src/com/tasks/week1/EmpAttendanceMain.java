package com.tasks.week1;

import java.util.ArrayList;

public class EmpAttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FullTimeEmployee> f = new ArrayList<FullTimeEmployee>(); // <String>
		ArrayList<PartTimeEmployee> p = new ArrayList<PartTimeEmployee>(); // <String	>
		
		FullTimeEmployee f1=new FullTimeEmployee(10,0,0);
		PartTimeEmployee p1=new PartTimeEmployee(10,0,0);
		f.add(f1);
		p.add(p1);
		
		for(int i=0;i<f.size();i++) {
			f.get(i).markAttendance(0);
			f.get(i).calculateLeaveBalance();
		}
		
		for(int i=0;i<p.size();i++) {
			p.get(i).markAttendance(0);
			p.get(i).calculateLeaveBalance();
		}
		
		
	}

}
