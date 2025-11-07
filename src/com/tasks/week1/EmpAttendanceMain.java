package com.tasks.week1;

public class EmpAttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee f=new FullTimeEmployee();
		f.markAttendance(2);
		f.calculateLeaveBalance();
		
		PartTimeEmployee p=new PartTimeEmployee();
		p.markAttendance(2);
		p.calculateLeaveBalance();

	}

}
