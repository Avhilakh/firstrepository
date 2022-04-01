package com.SerializablePackage;

public class Student extends Persist {
	
	int Rollno;
	int Class;
	static String str= "static member";
	public Student(int Rollno, int Class, String str) {
		this.Class = Class;
		this.Rollno = Rollno;
		this.str = str;
	}

}
