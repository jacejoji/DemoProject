package com.example.tasksweek1;

public class Magazine extends LibraryItem {
	String issueMonth;
	Magazine(String title,String author,String issueMonth){
		super(title,author);
		this.issueMonth=issueMonth;
	}
}
