package com.tasks.week1;

public class FullTimeEmployee implements EmployeeAttendance {
	int absent;
	int leaveBalance=15;
	public void markAttendance(int absent) {
		this.absent=absent;
		System.out.println("Attendance marked");
		
	}

	public void calculateLeaveBalance() {
		leaveBalance=15-absent;
		System.out.println("Leave balance is "+leaveBalance);
	}

}
