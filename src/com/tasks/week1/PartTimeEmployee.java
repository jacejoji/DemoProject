package com.tasks.week1;

public class PartTimeEmployee implements EmployeeAttendance{
	int attendance;
	int absent;
	int leaveBalance;
	public void markAttendance(int absent) {
		this.absent=absent;
		System.out.println("Attendance marked");
	}

	public void calculateLeaveBalance() {
		leaveBalance=15-absent;
		System.out.println("Leave balance is "+leaveBalance);
	}
	PartTimeEmployee(int attendance,
			int absent,
			int leaveBalance)
			{
				this.absent=absent;
				this.leaveBalance=leaveBalance;
				this.attendance=attendance;
				
			}
}
