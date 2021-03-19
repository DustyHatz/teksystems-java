package jpa.entitymodels;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Student {
	
	private String sEmail;
	private String sName;
	private String sPass;
	List<String> sCourses;
	
	// default constructor

	public Student() {
		super();
	}

	// constructor
	public Student(String sEmail, String sName, String sPass, List<String> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}
	
		
	
}
