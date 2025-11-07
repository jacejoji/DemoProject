package com.tasks.week1;

public class PartTimeEmployee implements EmployeeAttendance{
	int absent;
	int leaveBalance=5;
	public void markAttendance(int absent) {
		this.absent=absent;
		System.out.println("Attendance marked");
		
	}

	public void calculateLeaveBalance() {
		leaveBalance=15-absent;
		System.out.println("Leave balance is "+leaveBalance);
	}
}
